package ngheAn.Xe;

import xeco.info.xeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ngheAn extends xeMay {

    public int n;
    public ArrayList<xeMay> mangXe = new ArrayList<>();

    public ngheAn() {
    }
    public ngheAn(String bienSo, String loaiXe, String mauXe, float giaTien) {
        super(bienSo, loaiXe, mauXe, giaTien);
    }
    @Override
    public void hienThi() {
        System.out.println("Danh sach xe may o tinh Nghe An");
        mangXe.forEach((mangXe1) -> {
            mangXe1.hienThi();
        });
    }
    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho n xe may o tinh Nghe An");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            xeMay xm = new xeMay();
            xm.Nhap();
            mangXe.add(xm);
        }
    }
//    public void sapXep() {
//        Collections.sort(mangXe, (xeMay o1, xeMay o2) -> o1.getBienso().compareTo(o2.getBienso()));
//    }
//
//    public void soLuongXe() {
//        System.out.println("So luong xe quan li o Nghe An:" + mangXe.size());
//    }
//
//    public void timKiem() {
//        int a = -1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap bien so can tim");
//        String bienSo = sc.nextLine();
//        for (int i = 0; i < mangXe.size(); i++) {
//            if (mangXe.get(i).getBienso().equalsIgnoreCase(bienSo)) {
//                a = i;
//            }
//        }
//        if (a != -1) {
//            mangXe.get(a).hienThi();
//        } else {
//            System.out.println("Khong tim thay bien so" + bienSo);
//        }
//    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<xeMay> getMangXe() {
        return mangXe;
    }

    public void setMangXe(ArrayList<xeMay> mangXe) {
        this.mangXe = mangXe;
    }
}


