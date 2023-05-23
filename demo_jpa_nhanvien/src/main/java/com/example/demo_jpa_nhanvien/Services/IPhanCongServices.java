package com.example.demo_jpa_nhanvien.Services;

import com.example.demo_jpa_nhanvien.Model.NhanVien;

public interface IPhanCongServices {
    NhanVien addNewNhanVien(NhanVien nhanvienmnew);
    NhanVien removeNhanVien(int id);
    int TinhLuong1NV(int id);


}
