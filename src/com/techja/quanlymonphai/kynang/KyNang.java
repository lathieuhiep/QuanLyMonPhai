package com.techja.quanlymonphai.kynang;

public class KyNang {
    protected String ten, thuocTinh, moTa;
    protected int satThuong;

    public KyNang(String ten, String thuocTinh, String moTa, int satThuong) {
        this.ten = ten;
        this.thuocTinh = thuocTinh;
        this.moTa = moTa;
        this.satThuong = satThuong;
    }

    public void inTT() {
        System.out.println("Tên: " + ten);
        System.out.println("Thuộc tính: " + thuocTinh);
        System.out.println("Mô tả: " + moTa);
    }

    public int getSatThuong() {
        return satThuong;
    }
}
