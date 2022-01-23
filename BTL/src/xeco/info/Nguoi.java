package xeco.info;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Nguoi {
    private String Ten;
    private int Tuoi;
    private String SDT;
    private String CMND,Diachi;
    public static Pattern cmt=Pattern.compile("[0-9]{9}");
    public  static Pattern sdt=Pattern.compile("[0-9]{10}");
    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    @Override
    public String toString() {
        return "  Nguoi {" +
                "Ten = '" + Ten + '\'' +
                ", Tuoi = " + Tuoi +
                ", SDT = '" + SDT + '\'' +
                ", CMND = '" + CMND + '\'' +
                ", Diachi = '" + Diachi + '\'' +
                '}';
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("___THONG TIN CHU SO HUU___");
        System.out.println();
        System.out.print("Nhap ten: ");
        Ten=sc.nextLine();
        System.out.print("Nhap tuoi: "); Tuoi=sc.nextInt();sc.nextLine();

        do {
            System.out.print("Nhap SDT: ");
            SDT = sc.nextLine();
            if (!sdt.matcher(SDT).find())
                System.out.println("Moi nhap lai!");
        }
        while(!sdt.matcher(SDT).find());
        do {


                System.out.print("Nhap CMND: ");
            CMND = sc.nextLine();
            if (!cmt.matcher(CMND).find())
            {
                System.out.println("Moi nhap lai!");
            }
        }
        while(!cmt.matcher(CMND).find());
        System.out.print("Nhap Diachi: "); Diachi=sc.nextLine();
    }
    public String toFile() {
        return  Ten + '|' +         Tuoi +'|'+   SDT + '|' + CMND + '|' + Diachi+'|'                ;
    }
}
