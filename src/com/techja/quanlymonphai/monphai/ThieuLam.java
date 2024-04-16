package com.techja.quanlymonphai.monphai;

import com.techja.quanlymonphai.kynang.NoiCong;

public class ThieuLam extends MonPhai<NoiCong> {
    public ThieuLam(String ten, String truongMon, String noiO, String monQuy, String mota, NoiCong kyNang) {
        super(ten, truongMon, noiO, monQuy, mota, kyNang);
    }

    public void tungKinh() {
        System.out.println("Tụng kinh phổ độ chúng sinh !");
    }
}
