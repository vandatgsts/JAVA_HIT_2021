package bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    public String MaSV,Nganh;
    public int KhoaHoc;
    public SinhVien(){};
    public SinhVien(String MaSv,String Nganh,int KhoaHoc )
    {
        this.MaSV=MaSv;
        this.Nganh=Nganh;
        this.KhoaHoc=KhoaHoc;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public void setKhoaHoc(int khoaHoc) {
        KhoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập mã sinh viên : ");
        MaSV = sc.nextLine();
        System.out.print("Nhập ngành : ");
        Nganh = sc.nextLine();
        System.out.print("Nhập khóa : ");
        KhoaHoc = sc.nextInt();
    }

    public void Xuat()
    {
        super.Xuat();
        System.out.println("MSV: "+MaSV);
        System.out.println("Nganh: "+Nganh);
        System.out.println("Khoa hoc: "+KhoaHoc);
        System.out.println();
    }
}
