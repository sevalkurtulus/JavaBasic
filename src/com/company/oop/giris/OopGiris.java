package com.company.oop.giris;

public class OopGiris {
    public static void main(String[] args) {
        Ogrenci kurtulus = new Ogrenci();

        int [] sayi= new int[50];
        sayi[0]=1;
        int [] sayilarinHepsi = {5,6,7,8};


        kurtulus.isim="kurtuluş seval";
        kurtulus.sinif=9;
        kurtulus.ogrenciNo=1341;
        kurtulus.aktif=true;

        kurtulus.bilgileriYazdir();

        Ogrenci hasan = new Ogrenci();
        hasan.isim="hasan falan";
        hasan.sinif=11;
        hasan.ogrenciNo=7895;
       // hasan.aktif=true;
        hasan.bilgileriYazdir();

        Ogrenci bos=new Ogrenci();
        bos.bilgileriYazdir();

        Ogrenci ayse = new Ogrenci(500,"Ayse Yılmaz", (byte) 5,true);
        ayse.bilgileriYazdir();
    }
}
