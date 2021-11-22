package bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Document {
    protected String id,name,publisher;
    protected float price;
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id: ");
        id=sc.nextLine();
        System.out.println("nhap ten: ");
        name=sc.nextLine();
        System.out.println("nhap nha xuat ban: ");
        publisher =sc.nextLine();
        System.out.println("nhap gia: ");
        price=sc.nextFloat();
    }
    public void outPut()
    {
        System.out.printf("%15s",id,"%30s",name,"%30s",publisher,"%6f\n",price);
    }
}
