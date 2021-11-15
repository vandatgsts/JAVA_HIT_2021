package bai3;

import java.util.Scanner;

public class Nguoi {
    protected String HoTen,NgaySinh,QueQuan;
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        HoTen=sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        NgaySinh=sc.nextLine();
        System.out.println("nhap que quan: ");
        QueQuan=sc.nextLine();
    }
    public void Xuat()
    {
        System.out.println("ho ten: "+HoTen);
        System.out.println("ngay sinh: "+NgaySinh);
        System.out.println("que quan: "+QueQuan);
    }

}
