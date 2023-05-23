package com.example.demo_jpa_nhanvien.Repository;

import com.example.demo_jpa_nhanvien.Model.DuAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuAnRepo extends JpaRepository<DuAn,Integer> {
}
