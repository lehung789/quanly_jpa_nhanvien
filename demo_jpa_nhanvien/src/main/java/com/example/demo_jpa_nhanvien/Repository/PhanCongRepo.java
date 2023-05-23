package com.example.demo_jpa_nhanvien.Repository;

import com.example.demo_jpa_nhanvien.Model.PhanCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanCongRepo extends JpaRepository<PhanCong,Integer> {
}
