package com.company;
import FILE.DKFIle;
import xeco.info.xeMay;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<xeMay> xeNgheAn = new ArrayList<>();
    static List<xeMay> xeBacGiang = new ArrayList<>();
    static DKFIle DKF=new DKFIle();
    public static void main(String[] args) {
        DKF.OpenFileToRead("NgheAn.Dat");
        DKF.OpenFileToWrite("BacGiang.Dat");
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            switch (sc.nextInt()) {
                case 1: {
                    LuaChon1();
                }
                break;
                case 2: {
                    LuaChon2();
                }
                break;
                case 3: {
                    LuaChon3();
                }
                break;
                case 4: {
                    LuaChon4();
                }
                break;
                case 5: {
                    LuaChon5();
                }
                break;
                case 6: {
                    LuaChon6();
                }
                break;
                case 7: {
                    LuaChon7();
                }
                break;
                case 8: {
                    System.exit(0);
                }
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("1.Đăng ký thông tin cho  xe máy tại tỉnh Nghệ An.");
        System.out.println("2. Đăng ký thông tin cho  xe máy tại tỉnh Bắc Giang.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Tìm kiếm và cập nhật (nếu cần)  thông tin xe theo thông tin chủ sở hữu.");
        System.out.println("6. Thống kê số lượng xe đang quản lý.");
        System.out.println("7. Xuất all thông tin xe theo mã biển số xe");
    }

    public static void LuaChon1() {
        xeMay A = new xeMay();
        boolean check = false;
        do {
            A.Nhap();
            check = false;
            for (xeMay i : xeNgheAn) {
                if (A.getBienso().compareTo(i.getBienso()) == 0) {
                    System.out.println("bien so xe da ton tai");
                    check = true;
                } else if (A.getCMND().compareTo(i.getCMND()) == 0) {
                    System.out.println("CMND da ton tai");
                    check = true;
                }
            }
        }
        while (check);
        xeNgheAn.add(A);
        DKF.UpdatexeMayFile(xeNgheAn,"NgheAn.Dat");
    }

    public static void LuaChon2() {
        xeMay A = new xeMay();
        boolean check = false;
        do {
            A.Nhap();
            check = false;
            for (xeMay i : xeBacGiang) {
                if (A.getBienso().compareTo(i.getBienso()) == 0) {
                    System.out.println("bien so xe da ton tai");
                    check = true;
                } else if (A.getCMND().compareTo(i.getCMND()) == 0) {
                    System.out.println("CMND da ton tai");
                    check = true;
                }
            }
        }
        while (check);
        xeBacGiang.add(A);
        DKF.UpdatexeMayFile(xeBacGiang,"BacGiang.DAT");
    }

    public static void LuaChon3() {
        Scanner sc = new Scanner(System.in);
        menu0();
        switch (sc.nextInt()) {
            case 1: {
                xeNgheAn.sort((x, y) -> x.getBienso().compareTo(y.getBienso()));
                for (xeMay i : xeNgheAn) System.out.println(i.toString());
            }
            break;
            case 2: {
                xeBacGiang.sort((x, y) -> x.getBienso().compareTo(y.getBienso()));
                for (xeMay i : xeNgheAn) System.out.println(i.toString());
            }
            break;
            default:
                System.out.println("loi - moi thuc hien  lai");
        }


    }


    public static void LuaChon4() {
        Scanner sc = new Scanner(System.in);
        menu0();
        switch (sc.nextInt()) {
            case 1: {
                sc.nextLine();
                System.out.println("nhap bien so xe");
                String BSX = sc.nextLine();
                for (xeMay i : xeNgheAn) {
                    if (i.getBienso().compareTo(BSX) == 0) {
                        i.hienThi();
                        break;
                    }
                }
            }
            break;
            case 2: {
                sc.nextLine();
                System.out.println("nhap bien so xe");
                String BSX = sc.nextLine();
                for (xeMay i : xeBacGiang) {
                    if (i.getBienso().compareTo(BSX) == 0) {
                        i.hienThi();
                        break;
                    }
                }
            }
            break;
            default:
                System.out.println("loi- moi thuc hien lai");
        }
    }

    public static void LuaChon5() {
        Scanner sc = new Scanner(System.in);
        menu0();
        switch (sc.nextInt()) {
            case 1: {
                System.out.println("nhap so CMND");
                sc.nextLine();
                String CMT1 = sc.nextLine();
                for (xeMay i : xeNgheAn) {
                    if (i.getCMND().compareTo(CMT1) == 0) {
                        System.out.println(i.toString());
                        System.out.println("cap nhat thong tin (Y/N)");
                        String X=sc.nextLine();
                        if(X.compareTo("y")==0 || X.compareTo("Y")==0) {
                            System.out.println("thay doi thong tin chu so huu");
                            i.Nhap();
                        }
                    }
                }
            }
            break;
            case 2: {
                System.out.println("nhap so CMND");
                sc.nextLine();
                String CMT1 = sc.nextLine();
                for (xeMay i : xeBacGiang) {
                    if (i.getCMND().compareTo(CMT1) == 0) {
                        System.out.println(i.toString());
                        System.out.println("cap nhat thong tin (Y/N) ?");
                        String X=sc.nextLine();
                        if(X.compareTo("y")==0 || X.compareTo("Y")==0) {
                            System.out.println("thay doi thong tin chu so huu");
                            i.Nhap();
                        }
                    }
                }
            }
            break;
            default:
                System.out.println("loi-moi thuc hien lai");

        }
        DKF.UpdatexeMayFile(xeBacGiang,"NgheAn.dat");
        DKF.UpdatexeMayFile(xeBacGiang,"BacGiang.dat");
    }

    public static void LuaChon6() {
        System.out.println("Nghe An: " + xeNgheAn.size());
        System.out.println("Bac Giang: " + xeBacGiang.size());
    }

    public static void LuaChon7() {
        Scanner sc=new Scanner(System.in);
        menu0();
        switch (sc.nextInt()) {
            case 1: {
                for (xeMay i : xeNgheAn)
                    i.hienThi();
            }
            break;
            case 2: {
                for (xeMay i : xeBacGiang) {
                    i.hienThi();
                }
            }
            break;
            default:
                System.out.println("loi- moi thuc hien lai");
        }
    }

    public static void menu0() {
        System.out.println("1. Nghe An");
        System.out.println("2. Bac Giang");
    }
}



