package bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class Phieu {
    String maPHieu,TenPhieu;
    DateTime a;
    ArrayList<SANPHAM> x;
    int n;
    public void InputPhieu()
    {
        Scanner sc= new Scanner(System.in);
        a=new DateTime();
        System.out.println("NHAP MAPHIEU: ");
        maPHieu=sc.nextLine();
        System.out.println("NHAP TENPHIEU: ");
        TenPhieu=sc.nextLine();
        System.out.println("NHAP DATETIME");
        a.InputDate();
        System.out.println("NHAP N");
        n=sc.nextInt();
        x=new ArrayList<>();
        System.out.println("NHAP THONG TIN SAN PHAM");
        for(int i=0;i<n;i++) {
            SANPHAM x1 = new SANPHAM();
            System.out.println("SAN PHAM THU " + (i + 1));
            x1.InputSP();
            x.add(x1);
        }
    }
    public void OutputPhieu()
    {
        System.out.println("ma phieu: "+maPHieu);
        System.out.println("ten phieu: "+TenPhieu);
        a.OutputDate();
        System.out.println("XUAT THONG TIN SAN PHAM");
        for(int i=0;i<n;i++){
            System.out.println("SAN PHAM THU "+ (i+1));
            x.get(i).OutputSP();
            System.out.println("thanh tien: "+(x.get(i).getDonGia()*x.get(i).getSoLuong()));
        }
    }
}
