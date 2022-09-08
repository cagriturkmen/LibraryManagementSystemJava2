package com.bilgeadam.librarymanagementsystem.service;

import com.bilgeadam.librarymanagementsystem.repository.IBookRepository;
import com.bilgeadam.librarymanagementsystem.repository.IBorrowBookRepository;
import com.bilgeadam.librarymanagementsystem.repository.IStudentRepository;
import com.bilgeadam.librarymanagementsystem.repository.entity.Book;
import com.bilgeadam.librarymanagementsystem.repository.entity.BorrowBook;
import com.bilgeadam.librarymanagementsystem.repository.entity.Student;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class BorrowBookService extends ServiceManager<BorrowBook,Long> {

    private final IBorrowBookRepository borrowBookRepository;
    private final IBookRepository bookRepository;
    private final IStudentRepository studentRepository;

    public BorrowBookService(IBorrowBookRepository borrowBookRepository, IBookRepository bookRepository,IStudentRepository studentRepository) {
        super(borrowBookRepository);
        this.borrowBookRepository = borrowBookRepository;
        this.bookRepository = bookRepository;
        this.studentRepository = studentRepository;
    }

    public BorrowBook borrowBook(Long bookId, Long studentId){

        BorrowBook borrowBook;
        Book book =  bookRepository.getReferenceById(bookId);
        Student student = studentRepository.getReferenceById(studentId);
        if(book != null && !book.isBorrowed() && student != null){
            book.setBorrowed(true);
            borrowBook = new BorrowBook();
            borrowBook.setBook(book);
            borrowBook.setBookBorrowDate(System.currentTimeMillis());
            borrowBook.setStudent(student);
            borrowBookRepository.save(borrowBook);
        }else {
            throw new EntityNotFoundException("Book or Student not found!!");
        }
        return borrowBook;

    }

}
