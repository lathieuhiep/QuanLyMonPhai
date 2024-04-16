package com.techja.quanlymonphai.monphai;

import com.techja.quanlymonphai.kynang.KyNang;

public abstract class MonPhai<K extends KyNang> {
    protected String ten, truongMon, noiO, monQuy, mota;
    protected K kyNang;

    public MonPhai(String ten, String truongMon, String noiO, String monQuy, String mota, K kyNang) {
        this.ten = ten;
        this.truongMon = truongMon;
        this.noiO = noiO;
        this.monQuy = monQuy;
        this.mota = mota;
        this.kyNang = kyNang;
    }

    public void inTT() {
        System.out.println("Tên môn phái: " + ten);
        System.out.println("Trưởng môn: " + truongMon);
        System.out.println("Nơi ở: " + noiO);
        System.out.println("Môn quy: " + monQuy);
        System.out.println("Mô tả: " + mota);
        System.out.println("\nThông tin kỹ năng");
        kyNang.inTT();
    }

    public void anUong(String thucAn, String diaDiem) {
        System.out.println("Ăn " + thucAn + " ở " + diaDiem);
    }

    public void luyenCong(String vuKhi) {
        System.out.println("Sử dụng " + vuKhi + " để luyện công!");
    }

    public void soTai(MonPhai<?> mp2) {
        if ( kyNang.getSatThuong() > mp2.kyNang.getSatThuong() ) {
            System.out.println("Môn phái " + ten + " thắng môn phái " + mp2.ten);
            return;
        }

        if ( kyNang.getSatThuong() < mp2.kyNang.getSatThuong() ) {
            System.out.println("Môn phái " + ten + " thua môn phái " + mp2.ten);
            return;
        }

        System.out.println("Hai môn phái không phân thân thắng bại!!!");
    }

    public K getKyNang() {
        return kyNang;
    }
}
