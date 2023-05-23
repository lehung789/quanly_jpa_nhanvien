package com.example.demo_jpa_nhanvien.Model;

import javax.persistence.*;

@Entity
@Table
public class PhanCong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phanCongid;

    @Column(name = "nhanvienid",insertable = false  ,updatable = false)
    private int nhanVienid;

    @Column(name = "duanid",insertable = false  ,updatable = false)
    private int  duAnid;

    @Column
    private int soGioLam;

    @ManyToOne
    @JoinColumn(name="duanid")
    private DuAn duAn;

    @ManyToOne
    @JoinColumn(name = "nhanvienid")
    private NhanVien nhanVien;

    public int getPhanCongid() {
        return phanCongid;
    }

    public void setPhanCongid(int phanCongid) {
        this.phanCongid = phanCongid;
    }

    public int getNhanVienid() {
        return nhanVienid;
    }

    public void setNhanVienid(int nhanVienid) {
        this.nhanVienid = nhanVienid;
    }

    public int getDuAnid() {
        return duAnid;
    }

    public void setDuAnid(int duAnid) {
        this.duAnid = duAnid;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public DuAn getDuAn() {
        return duAn;
    }

    public void setDuAn(DuAn duAn) {
        this.duAn = duAn;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
