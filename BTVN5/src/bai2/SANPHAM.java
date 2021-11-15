package bai2;
import java.util.Scanner;
public class SANPHAM {
    public String MaSP,TenSP;
    public int soLuong;
    public float donGia;
    public void InputSP()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma san pham:  "); MaSP=sc.nextLine();
        System.out.println("nhap ten san pham: "); TenSP=sc.nextLine();
        System.out.println("nhap so luong: "); soLuong=sc.nextInt();
        System.out.println("nhap don gia: "); donGia=sc.nextFloat();
    }
    public void OutputSP()
    {
        System.out.println("ma SP: " + MaSP);
        System.out.println("ten san pham: " + TenSP);
        System.out.println("so luong: "+soLuong);
        System.out.println("don gia: "+donGia);
    }

    public int getSoLuong() {
        return soLuong;
    }
    public float getDonGia() {
        return donGia;
    }
}
