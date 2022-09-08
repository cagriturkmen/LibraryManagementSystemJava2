package com.bilgeadam.librarymanagementsystem.repository;

import com.bilgeadam.librarymanagementsystem.repository.entity.Admin;
import com.bilgeadam.librarymanagementsystem.repository.entity.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowBookRepository extends JpaRepository<BorrowBook,Long> {

}
