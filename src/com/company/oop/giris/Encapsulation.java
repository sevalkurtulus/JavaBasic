package com.company.oop.giris;

public class Encapsulation {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci(50,"kurtuluş",(byte)5,true);

        ogr1.setOgrenciNo(20);
        ogr1.bilgileriYazdir(10);
        System.out.println("Ogrenci No:"+ogr1.getOgrenciNo());
    }
}
