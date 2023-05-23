package com.example.demo_jpa_nhanvien.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbContext {
    @Autowired
    public DuAnRepo duAnRepo;
    @Autowired
    public NhanVienRepo nhanVienRepo;
    @Autowired
    public PhanCongRepo phanCongRepo;


}
