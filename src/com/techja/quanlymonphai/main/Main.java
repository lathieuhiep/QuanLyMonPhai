package com.techja.quanlymonphai.main;

import com.techja.quanlymonphai.kynang.NgoaiCong;
import com.techja.quanlymonphai.kynang.NoiCong;
import com.techja.quanlymonphai.monphai.CaiBang;
import com.techja.quanlymonphai.monphai.MonPhai;
import com.techja.quanlymonphai.monphai.ThieuLam;

public class Main {
    public static void main(String[] args) {
        NoiCong kn1 = new NoiCong("La hán quyền", "Kim", "Võ công nhập môn", 1000);
        MonPhai<NoiCong> mp1 = new ThieuLam("Thiếu lâm quyền", "Đạt ma sư tổ", "Chùa", "Tứ đại giai không", "Là môn phái ăn chay niệm phật", kn1);

        NgoaiCong kn2 = new NgoaiCong("Hàng long thập bát chưởng", "Mộc", "Võ công thượng thừa", 1000);
        MonPhai<NgoaiCong> mp2 = new CaiBang("Cái bang", "Hồng thất công", "Ngoài đường", "Cướp người giàu, chia cho kẻ nghèo", "Là môn phái bẩn thỉu nhất", kn2);

        mp1.inTT();
        ((ThieuLam)mp1).tungKinh();
        mp1.getKyNang().vanCong();

        mp1.anUong("Chay", "Chùa");
        mp1.luyenCong("Bao tay");

        System.out.println();

        mp2.inTT();
        ((CaiBang)mp2).anXin();
        mp2.getKyNang().danhLienHoan();

        mp2.anUong("Ăn bánh bao", "Ngoài đường");
        mp2.luyenCong("Gậy oánh chó");

        System.out.println("========>So tài môn phái<========");
        mp1.soTai(mp2);
    }
}