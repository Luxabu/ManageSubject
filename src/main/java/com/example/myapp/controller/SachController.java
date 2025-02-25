package com.example.myapp.controller;

import com.example.myapp.model.Sach;
import com.example.myapp.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SachController {

    @Autowired
    private SachService sachService;

    @GetMapping("/sach")
    public String showSachList(Model model) {
        List<Sach> listSach = sachService.getAllSach();
        model.addAttribute("listSach", listSach);
        return "sach"; // Trả về file sach.jsp
    }
}
