package com.example.demo_jpa_nhanvien.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.dynalink.linker.LinkerServices;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nhanVienid;

    @Column
    private String hoTen;

    @Column
    private String Sodienthoai;

    @Column
    private String diaChi;

    @Column
    private String emial;

    @Column
    private int heSoLuong;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "nhanVien",cascade = CascadeType.ALL)
    private Set<PhanCong> phancongs;

    public int getNhanVienid() {
        return nhanVienid;
    }

    public void setNhanVienid(int nhanVienid) {
        this.nhanVienid = nhanVienid;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Set<PhanCong> getPhancongs() {
        return phancongs;
    }

    public void setPhancongs(Set<PhanCong> phancongs) {
        this.phancongs = phancongs;
    }
}
