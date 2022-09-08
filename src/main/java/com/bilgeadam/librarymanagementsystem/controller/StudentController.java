package com.bilgeadam.librarymanagementsystem.controller;

import com.bilgeadam.librarymanagementsystem.repository.entity.BorrowBook;
import com.bilgeadam.librarymanagementsystem.repository.entity.Student;
import com.bilgeadam.librarymanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student entity){

       return ResponseEntity.ok(studentService.save(entity));

    }

    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestBody Student entity){

        return ResponseEntity.ok(studentService.save(entity)) ;
    }

    @PostMapping("/delete")
    public void deleteById(@RequestBody Long id){
        studentService.deleteById(id);
    }


}
