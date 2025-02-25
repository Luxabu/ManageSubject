package com.example.myapp.service;

import com.example.myapp.model.Sach;
import com.example.myapp.repository.SachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SachService {
    @Autowired
    private SachRepository sachRepository;

    public List<Sach> getAllSach() {
        return sachRepository.findAll();
    }

    public List<Sach> searchSach(String keyword) {
        return sachRepository.findByTuaSachContaining(keyword);
    }
}
