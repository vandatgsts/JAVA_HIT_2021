package xeco.info;

import java.util.Scanner;

public class xeMay extends Nguoi implements IXe {
    public String bienSo,loaiXe, mauXe;
    public float giaTien;

    public xeMay() {
    }
    public xeMay(String bienSo, String loaiXe, String mauXe, float giaTien) {
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.mauXe = mauXe;
        this.giaTien = giaTien;
    }

    public xeMay(String data, int parseInt, String data1, String data2, String data3, String data4, String data5, String data6,  float parseFloat) {
        setTen(data);
        setTuoi(parseInt);
        setSDT(data1);
        setCMND(data2);
        setDiachi(data3);
        setBienso(data4);
        setLoaixe(data5);
        setMauxe(data6);
        setGiatien(parseFloat);
    }




    @Override
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.println();
        System.out.println("___THONG TIN XE___");
        System.out.println();
        System.out.print("Nhap bien so: ");
        bienSo = scanner.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = scanner.nextLine();
        System.out.print("Nhap mau xe: ");
        mauXe = scanner.nextLine();
        System.out.print("Nhap gia tien: ");
        giaTien = Integer.parseInt(scanner.nextLine());
    }



    @Override
    public void hienThi(){
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return "  xeMay {" +
                "bienSo = '" + bienSo + '\'' +
                ", loaiXe = '" + loaiXe + '\'' +
                ", mauXe = '" + mauXe + '\'' +
                ", giaTien = " + giaTien +
                '}';
    }

    public String getBienso() {
        return bienSo;
    }

    public void setBienso(String bienso) {
        this.bienSo = bienso;
    }

    public String getLoaixe() {
        return loaiXe;
    }

    public void setLoaixe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMauxe() {
        return mauXe;
    }

    public void setMauxe(String mauXe) {
        this.mauXe = mauXe;
    }

    public float getGiatien() {
        return giaTien;
    }

    public void setGiatien(float giaTien) {
        this.giaTien = giaTien;
    }
    public String toFile() {
        return super.toFile()      +
                 bienSo + '|' +
                  loaiXe + '|' +
                  mauXe + '|' +
                giaTien ;

    }

}


