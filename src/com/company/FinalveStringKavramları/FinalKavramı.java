package com.company.FinalveStringKavramları;

public class FinalKavramı {
    public static void main(String[] args) {
        //Değişkenlerde değer değiştirmeyi engeller
        int sayi = 10;
        sayi = 15;
        final int sayi2;

        Kedi d1 = new Kedi();
        Kedi d2 = new Kaplan();

        d1.goster();
        d2.goster();

    }

}


class Kedi {
    final public void goster() {
        System.out.println("Parenttaki göster methodu");
    }

}

class Kaplan extends Kedi {

}

