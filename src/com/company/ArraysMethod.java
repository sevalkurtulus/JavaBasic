package com.company;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] sayilar ={0,9,6,3,8,7,4};
        int[] sayilar2 ={0,9,6,3,8,7,4};
        System.out.println("Sıralama öncesi dizi");
        diziYazdir(sayilar);
        //Arrays.sort(sayilar);
        //Arrays.sort(sayilar,2,5);
        Arrays.parallelSort(sayilar);
        Arrays.parallelSort(sayilar2);
        System.out.println("Sıralama sonrası dizi");
        diziYazdir(sayilar);

        int sonuc =Arrays.binarySearch(sayilar,9);
        System.out.println("Sonuc :"+sonuc);

        System.out.println("Sayilar1 ve sayilar2 aynı mı \n?" +Arrays.equals(sayilar,sayilar2));

        int[] yeniDizi =new int[20];
        Arrays.fill(yeniDizi,0,10,50);
        System.out.println("Yeni dizi\n");
        diziYazdir(yeniDizi);

    }
    public static void diziYazdir(int[] dizi){
        for(int i:dizi){
            System.out.println(i+",");
        }
    }
}
