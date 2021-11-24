package com.company.Basic;

public class MethodlaraDiziGondermek {
    public static void main(String[] args) {
        int sayilar[] = {1,2,3};
        diziGoster(sayilar);
        System.out.println("Methoddan önce index 0"+sayilar[0]);
        degeribirarttir(sayilar[0]);
        System.out.println("Methoddan sonra index 0"+sayilar[0]);
        System.out.println("Dizi değerlerini arttırmadan önce\n");
        diziGoster(sayilar);
        diziDegerleriniBirArttir(sayilar);
        System.out.println("Dizi değerlerini arttırmadan sonra\n");
        diziGoster(sayilar);

    }

    private static void diziDegerleriniBirArttir(int[] sayilar) {
        sayilar[0] ++;
        sayilar[1] ++;
        sayilar[2] ++;
    }

    private static void degeribirarttir(int i) {
        i++;
    }


    private static void diziGoster(int[] dizi) {
        for (int i : dizi)
            System.out.println("eleman :" + i);

    }
}
