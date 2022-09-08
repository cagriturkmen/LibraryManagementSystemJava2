package com.bilgeadam.librarymanagementsystem.repository;

import com.bilgeadam.librarymanagementsystem.repository.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin,Long> {
}
