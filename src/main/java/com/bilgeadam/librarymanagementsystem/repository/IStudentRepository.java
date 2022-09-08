package com.bilgeadam.librarymanagementsystem.repository;

import com.bilgeadam.librarymanagementsystem.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
}
