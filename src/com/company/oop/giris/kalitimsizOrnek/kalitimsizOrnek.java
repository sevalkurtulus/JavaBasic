package com.company.oop.giris.kalitimsizOrnek;

public class kalitimsizOrnek {
    public static void main(String[] args) {
        Personel mudur = new Personel("ahmet", 123456, -8);
        System.out.println(mudur);
        student kurtuluş = new student("Kurtuluş",18,12345,8526);
        System.out.println(kurtuluş);
    }
}

class Personel {
    private String isim;
    private long tcKimlik;
    private int yas;

    public Personel() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Personel(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18)
            this.yas = yas;
        else this.yas = 18;
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " tc:" + tcKimlik + " yas:" + yas;
    }
}

class student {
    private String isim;
    private int yas;
    private long tcKimlik;
    private int okulNo;

    public student() {
        isim ="Henüz belirtilmedi";
        tcKimlik=0;
        yas=18;
        okulNo=500;
    }

    public student(String isim, int yas, long tcKimlik, int okulNo) {
        this.isim = isim;
        setYas(yas);
        this.tcKimlik = tcKimlik;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 7)
            this.yas = yas;
        else this.yas = 7;
    }


    public long getTcKimkil() {
        return tcKimlik;
    }

    public void setTcKimkil(long tcKimkil) {
        this.tcKimlik = tcKimkil;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " tc:" + tcKimlik + " yas:" + yas + "Okul No" + okulNo;
    }
}




















