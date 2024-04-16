package com.techja.quanlymonphai.kynang;

public class NgoaiCong extends KyNang {
    public NgoaiCong(String ten, String thuocTinh, String moTa, int satThuong) {
        super(ten, thuocTinh, moTa, satThuong);
    }

    public void danhLienHoan() {
        System.out.println("Liên hoàn cước");
    }
}
