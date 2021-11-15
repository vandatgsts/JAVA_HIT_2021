package bai1;
import java.util.Scanner;
public class Sanpham {
    protected String maSp,tenSP,tenHSX,ngayNhap;
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ma san pham: "); maSp=sc.nextLine();
        System.out.println("nhap ten san pham: ");tenSP=sc.nextLine();
        System.out.println("nhap ten hang san xuat: "); tenHSX=sc.nextLine();
        System.out.println("nhap ngay nhap: ");  ngayNhap=sc.nextLine();
    }
    public void Xuat() {
        System.out.println("ma san pham: "+ maSp);
        System.out.println("ten san pham: "+tenSP);
        System.out.println("ten hang san xuat: "+tenHSX);
        System.out.println("ngay nhap: "+ngayNhap);
    }
}
