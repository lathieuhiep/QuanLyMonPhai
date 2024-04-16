package com.techja.quanlymonphai.monphai;

import com.techja.quanlymonphai.kynang.KyNang;
import com.techja.quanlymonphai.kynang.NoiCong;

public class VoDang extends MonPhai<NoiCong> {

    public VoDang(String ten, String truongMon, String noiO, String monQuy, String mota, NoiCong kyNang) {
        super(ten, truongMon, noiO, monQuy, mota, kyNang);
    }

    public void giangDao() {
        System.out.println("Giảng đạo");
    }
}
