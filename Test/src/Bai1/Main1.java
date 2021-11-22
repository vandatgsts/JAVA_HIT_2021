package Bai1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        int cnt=0;
        int sum=0,tich=1;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9')
            {   cnt++;
                sum+=s.charAt(i)-'0';
            }
        }
        for(int i=0;i<s.length();i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9' && sum%(s.charAt(i)-'0') ==0)
            {
                tich*=(s.charAt(i)-'0');
            }
        }
        System.out.println("co "+ cnt +" ky tu so" );
        System.out.println("Tich: "+tich);

    }
}
