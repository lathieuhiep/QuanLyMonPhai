package com.techja.quanlymonphai.monphai;

import com.techja.quanlymonphai.kynang.NgoaiCong;

public class CaiBang extends MonPhai<NgoaiCong> {

    public CaiBang(String ten, String truongMon, String noiO, String monQuy, String mota, NgoaiCong kyNang) {
        super(ten, truongMon, noiO, monQuy, mota, kyNang);
    }

    public void anXin() {
        System.out.println("Ăn xin mưu sinh");
    }
}
