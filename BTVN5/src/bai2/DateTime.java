package bai2;
import java.util.Scanner;
public class DateTime {
    public int ngay,thang,nam;
    public void InputDate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ngay: "); ngay=sc.nextInt();
        System.out.println("nhap thang: "); thang=sc.nextInt();
        System.out.println("nhap nam:" ); nam=sc.nextInt();
    }
    public void OutputDate()
    {
        System.out.println("ngay: "+ this.ngay +"/"+ this.thang+"/"+this.nam);
    }
}
