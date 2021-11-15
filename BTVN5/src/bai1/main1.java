package bai1;
import java.util.ArrayList;
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so luong dieu hoa");
        int n=sc.nextInt();
        ArrayList<dieuhoa> dh=new ArrayList<>(n);
        System.out.println("nhap thong tin dieu hoa");
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap dieu hoa thu "+(i+1));
            dieuhoa dhc=new dieuhoa();
            dhc.Nhap();
            dh.add(dhc);
        }
        int cnt=0;
        for(int i=0;i<n;i++)
            if(dh.get(i).tenHSX.equals("Electrolux"))
            {
                dh.get(i).Xuat();
                cnt++;
            }
        if(cnt==0) System.out.println("khong ton tai");
        else
        {
            float Mingia=dh.get(0).giaBan;
            for(int i=0;i<n;i++)
            {
                Mingia=Math.min(Mingia,dh.get(i).giaBan);
            }
            System.out.println("Gia ban thap nhat "+ Mingia);
        }
    }
}
