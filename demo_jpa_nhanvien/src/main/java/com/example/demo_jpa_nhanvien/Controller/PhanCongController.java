package com.example.demo_jpa_nhanvien.Controller;

import com.example.demo_jpa_nhanvien.Model.DuAn;
import com.example.demo_jpa_nhanvien.Model.NhanVien;
import com.example.demo_jpa_nhanvien.Repository.DuAnRepo;
import com.example.demo_jpa_nhanvien.Repository.NhanVienRepo;
import com.example.demo_jpa_nhanvien.Repository.PhanCongRepo;
import com.example.demo_jpa_nhanvien.Services.PhanCongServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class PhanCongController {
    @Autowired
    PhanCongServices phanCongServices;
    @Autowired
    PhanCongRepo phanCongRepo;
    @Autowired
    DuAnRepo duAnRepo;
    @Autowired
    NhanVienRepo nhanVienRepo;

    @RequestMapping(value = "phancong/themnhanvien",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public NhanVien addNewHocSinh(@RequestBody String nhanvien){
        Gson gson = new Gson();
        NhanVien nv = gson.fromJson(nhanvien,NhanVien.class);
        return phanCongServices.addNewNhanVien(nv);
    }
    @RequestMapping(value = "phancong/xoanhanvien",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public NhanVien removeNhanVien(int id){
        return phanCongServices.removeNhanVien(id);
    }

    @RequestMapping(value = "phancong/suaduan",method = RequestMethod.PUT)
        public void SuaDuAn(@RequestBody String duAn){
        Gson gson=new Gson();
        DuAn duanNew= gson.fromJson(String.valueOf(duAn),DuAn.class);
       DuAn duanCurr = duAnRepo.findById(duanNew.getDuAnid()).get();
       duanCurr.setTenDuAn(duanNew.getTenDuAn());
       duanCurr.setGhiChu(duanNew.getGhiChu());
       duanCurr.setMoTa(duanNew.getMoTa());
       duanCurr.setPhancong(duanNew.getPhancong());
       duAnRepo.save(duanCurr);
    }

    @RequestMapping(value = "phancong/tinhluong1nv",method = RequestMethod.GET)
    public int TinhLuong1NV(@RequestParam int id){
        return phanCongServices.TinhLuong1NV(id);
    }

}
