package com.company.Basic;

public class IfElseKullanimi {
    public static void main(String[] args) {

        //if else blokları
        int benimYasim = 30;
        int onunYasi = 24;

        if (benimYasim > onunYasi) {
            System.out.println("Ben büyüğüm");
        } else if (benimYasim < onunYasi) {
            System.out.println("ben küçüğüm");
        } else {
            System.out.println("Yaşlarımız aynı");
        }
        System.out.println("Program sonlandı");
        int sayi = 6;

        if (sayi < 10)
            System.out.println("Sayi 5 den büyüktür");

    }
}

