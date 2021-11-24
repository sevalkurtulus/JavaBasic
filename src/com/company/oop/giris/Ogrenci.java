package com.company.oop.giris;

public class Ogrenci {
    //öğrenci nesnesinin bildiği değerler

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;
    public Ogrenci(){
        System.out.println("Nesne oluşturuluyor");
        aktif=true;
        ogrenciNo=9999;
        isim="Henüz verilmedi";
        sinif=127;
    }
    public Ogrenci(int ogrenciNo,String isim, byte sinif,boolean aktif){
            this.ogrenciNo=ogrenciNo;
            this.isim=isim;
            this.sinif=sinif;
            this.aktif=aktif;

    }

    public void dersAl() {
        System.out.println("ders alıyor");
    }

    public void bilgileriYazdir() {
        if (aktif == true) {
            System.out.println("Adım : " + isim + " numaram : " + ogrenciNo + " sınıfım : " + sinif);
        } else {
            System.out.println("Öğrenci aktif değil");
        }

    }
}
