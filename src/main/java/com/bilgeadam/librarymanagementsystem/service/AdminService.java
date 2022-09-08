package com.bilgeadam.librarymanagementsystem.service;

import com.bilgeadam.librarymanagementsystem.repository.IAdminRepository;
import com.bilgeadam.librarymanagementsystem.repository.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends ServiceManager<Admin,Long> {

    private final IAdminRepository adminRepository;

    public AdminService(IAdminRepository adminRepository) {
        super(adminRepository);
        this.adminRepository = adminRepository;
    }
}
