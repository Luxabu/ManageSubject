package com.example.myapp.repository;

import com.example.myapp.model.Sach;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SachRepository extends JpaRepository<Sach, String> {
    // Các phương thức tùy chỉnh (nếu cần)
    List<Sach> findByTuaSachContaining(String tuaSach); // Tìm sách theo tiêu đề
    List<Sach> findByTacGia(String tacGia); // Tìm sách theo tác giả
}
