package bai2;

import java.util.Scanner;

public class Book extends Document{
    private int numberOfPage;
    private String author;
    public Book(){};
    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        super.Input();
        System.out.println("nhap so trang: ");
        numberOfPage=sc.nextInt();
        System.out.println("nhap tac gia: ");
        author= sc.nextLine();
    }
    public void outPut()
    {
        System.out.printf("%5d",numberOfPage,"%30s",author);
        super.outPut();
    }
}
