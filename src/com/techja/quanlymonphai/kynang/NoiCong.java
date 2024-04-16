package com.techja.quanlymonphai.kynang;

public class NoiCong extends KyNang {
    public NoiCong(String ten, String thuocTinh, String moTa, int satThuong) {
        super(ten, thuocTinh, moTa, satThuong);
    }

    public void vanCong() {
        System.out.println("Vận công trị thương!");
    }
}
