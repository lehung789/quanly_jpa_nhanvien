package com.example.demo_jpa_nhanvien.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class DuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int duAnid;

    @Column
    private String tenDuAn;

    @Column
    private String moTa;

    @Column
    private String ghiChu;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "duAn")
    private Set<PhanCong> phancong;

    public int getDuAnid() {
        return duAnid;
    }

    public void setDuAnid(int duAnid) {
        this.duAnid = duAnid;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Set<PhanCong> getPhancong() {
        return phancong;
    }

    public void setPhancong(Set<PhanCong> phancong) {
        this.phancong = phancong;
    }
}
