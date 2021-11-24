package com.company.ArrayExample;

public class ArraysExample1 {
    public static void main(String[] args) {
        //Bellekte 100 elemanlı bir dizi tutmak için
        int sayilar[]= new int[100];
        int sayilarinToplami=0;

        for(int i=0;i<sayilar.length;i++){
            int rastgeleSayi = (int) (Math.random()*100);
            sayilar[i]=rastgeleSayi;
            sayilarinToplami +=rastgeleSayi;
            //veya -> sayilarinToplami = sayilarinToplami + rastgeleSayi;
        }
    double ortalama =(double) sayilarinToplami/(double)sayilar.length;
        System.out.println("Ortalama" +ortalama);
        int ortalamaAltindakiSayi=0;

        for (int i=0;i<sayilar.length;i++){
            if(sayilar[i] <ortalama){
                ortalamaAltindakiSayi++;
            }
        }
        System.out.println("Ortalama" +ortalama +"Ve ortalama altındaki değerlerin sayisi" +ortalamaAltindakiSayi);
    }
}
