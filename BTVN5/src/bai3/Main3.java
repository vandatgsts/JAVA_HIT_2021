package bai3;

public class Main3 {
    public static void main(String[] args) {
        LOPHOC x=new LOPHOC();
        x.Nhap();
        x.Xuat();
        System.out.println("co "+ x.Count()+"sinh vien khoa k15");
        x.Sort();
        x.Xuat();
    }
}
