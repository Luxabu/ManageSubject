package com.example.myapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Sach {
    @Id
    @Column(name = "MASACH", length = 10)
    private String maSach;

    @Column(name = "TUASACH", length = 50)
    private String tuaSach;

    @Column(name = "TACGIA", length = 50)
    private String tacGia;

    @Column(name = "NHAXUATBAN", length = 50)
    private String nhaXuatBan;

    // Constructor không tham số (required for JPA)
    public Sach() {}

    // Constructor đầy đủ (tùy chọn)
    public Sach(String maSach, String tuaSach, String tacGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.tuaSach = tuaSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
    }

    // Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTuaSach() {
        return tuaSach;
    }

    public void setTuaSach(String tuaSach) {
        this.tuaSach = tuaSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
}