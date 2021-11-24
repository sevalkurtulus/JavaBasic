package com.company.Basic;

public class Methods {
    public static void main(String[] args) {
        menuGoster();
        sayilariTopla(10, 15);
        int sayi = 5;
        sayiyiDegistir(sayi);
        sayilarinFarkiniBul(10, 6);
        System.out.println("fark :" + sayilarinFarkiniBul(10, 6));

    }

    public static int sayilarinFarkiniBul(int a, int b) {
        // System.out.println("Farkı : "+(a-b));
        return (a - b);
    }

    public static void sayiyiDegistir(int x) {
        x = x + 10;
        System.out.println("Sayının 10 fazlası :" + x);
    }

    //parametre alan method örneği
    public static void sayilariTopla(int a, int b) {
        int s1 = 5;
        int s2 = 10;
        System.out.println("toplam :" + (s1 + s2));
    }

    //parametre almayan ve geriye değer döndürmeyen
    public static void menuGoster() {
        System.out.println("******MENU******");
        System.out.println("1- İki sayinin toplamını bul");
        System.out.println("2- İki sayinin farkını bul");
        System.out.println("3- İki sayinin çarpımını bul");
    }

}
