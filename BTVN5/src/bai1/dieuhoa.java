package bai1;
import java.util.Scanner;
public class dieuhoa extends Sanpham{
    public float congSuat,giaBan;
    public void Nhap()
    {  super.Nhap();
       Scanner sc=new Scanner(System.in);
        System.out.println("nhap cong xuat: ");congSuat=sc.nextFloat();
        System.out.println("nhap gia ban: "); giaBan=sc.nextFloat();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("CONGXUAT: "+congSuat);
        System.out.println("GIABAN: "+giaBan);
    }

}
