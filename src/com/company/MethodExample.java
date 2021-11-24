package com.company;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {

        int kullaniciSecimi=-1;
     /*   while(kullaniciSecimi != 0){
            kullaniciSecimi = menuGoster();
       }*/
        for(;;){
            kullaniciSecimi = menuGoster();
            if(kullaniciSecimi == 0){
                break;
            }
            Scanner tara = new Scanner(System.in);
            System.out.println("Birinci sayıyı girin");
            int birinciSayi = tara.nextInt();
            System.out.println("İkinci sayıyı girin");
            int ikinciSayi = tara.nextInt();

            switch(kullaniciSecimi){
                case 1 :
                    ikiSayiyiCarp(birinciSayi,ikinciSayi);
                break;
                case 2 :
                    int toplam= ikiSayiyiTopla(birinciSayi,ikinciSayi);
                    System.out.println("İki sayının toplamı " +toplam);
                break;

            }

        }
    }

    public static int ikiSayiyiTopla(int birinciSayi, int ikinciSayi) {
        int toplam =birinciSayi + ikinciSayi;
        return toplam;
    }

    public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi) {
        System.out.println("Carpim :"+birinciSayi*ikinciSayi);
    }

    public static int menuGoster() {
        System.out.println("********Menu********");
        System.out.println("1- İki sayının carpımını bul");
        System.out.println("2- İki sayının toplamını bul");
        System.out.println("3- İki sayının kuvvetini bul");
        System.out.println("Çıkmak için 0'ı tuşlayınız");

        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;
    }
}
