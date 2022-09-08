package com.bilgeadam.librarymanagementsystem.service;

import com.bilgeadam.librarymanagementsystem.repository.IStudentRepository;
import com.bilgeadam.librarymanagementsystem.repository.entity.BorrowBook;
import com.bilgeadam.librarymanagementsystem.repository.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends ServiceManager<Student, Long> {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        super(studentRepository);
        this.studentRepository = studentRepository;
    }

}
