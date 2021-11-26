package com.company.oop.giris.kalitimliOrnek;

public class kalitimliOrnek {
    public static void main(String[] args) {
        Personel mudur = new Personel("kurtuluş", 12354, 20, "müdür");
        System.out.println(mudur);

        Ogrenci kurtulus = new Ogrenci("kurtulus", 1234, 19, 1234);
        System.out.println(kurtulus);

    }
}

class Kisi {
    private String isim;
    private long tcKimlik;
    private int yas;

    public Kisi() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
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

class Personel extends Kisi {
    private String pozisyon;

    public Personel(String isim, long tcKimlik, int yas, String pozisyon) {
      /*  setYas(yas);
        setIsim(isim);
        setTcKimlik(tcKimlik);*/
        super(isim,tcKimlik,yas);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel adı:" + getIsim() + "tc kimlik :" + getTcKimlik() + "yas" + getYas() + "pozisyon" + getPozisyon();
    }
}

class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
        /*setYas(yas);
        setIsim(isim);
        setTcKimlik(tcKimlik);*/
        super(isim,tcKimlik,yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci adı : "+getIsim()+"Tc Kimlik : "+getTcKimlik()+"Yaşı : "+getYas()+"Ogrenci numarası"+ogrenciNo ;
    }
}

