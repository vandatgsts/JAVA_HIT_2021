package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LOPHOC {
    private String MaLH,tenLH,NgayMo;
    ArrayList<SinhVien> x;
    int n;
    private String GiaoVien;

    public LOPHOC(){};
    public LOPHOC(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> x, int n, String giaoVien) {
        MaLH = maLH;
        this.tenLH = tenLH;
        NgayMo = ngayMo;
        this.x = x;
        this.n = n;
        GiaoVien = giaoVien;
    }
    public String getMaLH() {
        return MaLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setMaLH(String maLH) {
        MaLH = maLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public void setNgayMo(String ngayMo) {
        NgayMo = ngayMo;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setGiaoVien(String giaoVien) {
        GiaoVien = giaoVien;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ma lop hoc: ");
        MaLH=sc.nextLine();
        System.out.print("Ten lop hoc: ");tenLH=sc.nextLine();
        System.out.print("Ngay mo: ");
        NgayMo=sc.nextLine();
        System.out.print("Ten giao vien: ");
        GiaoVien=sc.nextLine();
        System.out.print("So luong sinh vien: ");
        n=sc.nextInt();
        x=new ArrayList<>();
        for(int i=0; i<n; i++){
            SinhVien sv = new SinhVien();
            System.out.println("Nhap sv thu "+(i+1));
            sv.Nhap();
            x.add(sv);
        }
    }
    public void Xuat() {
        System.out.println("Ma lop: " + MaLH);
        System.out.println("Ten lop: " + tenLH);
        System.out.println("Ngay mo: " + NgayMo);
        System.out.println("Ten giao vien: " + GiaoVien);
        System.out.println("So luong sinh vien: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("SV thu " + (i + 1));
            x.get(i).Xuat();
        }
    }
    public int Count()
    {
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(x.get(i).getKhoaHoc()==15)
                cnt++;
        }
        return cnt;
    }
    public void Sort()
    {
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if (x.get(i).getKhoaHoc()>x.get(j).getKhoaHoc())
                    Collections.swap(x,i,j);
            }
        }
    }
}
