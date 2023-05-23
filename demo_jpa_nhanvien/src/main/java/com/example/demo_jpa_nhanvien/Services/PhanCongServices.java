package com.example.demo_jpa_nhanvien.Services;

import com.example.demo_jpa_nhanvien.Model.NhanVien;
import com.example.demo_jpa_nhanvien.Model.PhanCong;
import com.example.demo_jpa_nhanvien.Repository.DbContext;
import com.example.demo_jpa_nhanvien.Repository.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhanCongServices implements IPhanCongServices{
    @Autowired
    NhanVienRepo nhanVienRepo;
    @Autowired
    DbContext contetx;
    @Override
    public NhanVien addNewNhanVien(NhanVien nhanvienmnew) {
        nhanVienRepo.save(nhanvienmnew);
        return nhanvienmnew;
    }

    @Override
    public NhanVien removeNhanVien(int id) {

        Optional<NhanVien> nhanvien= nhanVienRepo.findById(id);
        if(nhanvien.isEmpty()){
            return null;
        }
//        Set<PhanCong> phancong = nhanvien.get().getPhancongs();
//        contetx.phanCongRepo.deleteAll(phancong);
        nhanVienRepo.delete(nhanvien.get());
        return nhanvien.get();
    }

    @Override
    public int TinhLuong1NV(int id) {
        int tongsogiolam=0;
        List<PhanCong> listPC = contetx.phanCongRepo.findAll();
//       for(PhanCong x :listPC){
//           if(x.getNhanVienid()==id){
//               tongsogiolam+=x.getSoGioLam();
//           }
//       }
       NhanVien nv = nhanVienRepo.findById(id).get();
       nv.getPhancongs();
        for(PhanCong x :nv.getPhancongs()){
                tongsogiolam+=x.getSoGioLam();
        }
       int luong= tongsogiolam * 15 * nv.getHeSoLuong();
       return luong;
    }


}
