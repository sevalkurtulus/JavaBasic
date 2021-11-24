package com.company.Basic;

public class DizilerinKiyaslanmasi {
    public static void main(String[] args) {
        int[] sayilar = {2, 7, 3, 4, 6, 9};
        // diziYazdir(sayilar);
        diziDegistir(sayilar);
        System.out.println("Yer değiştirme sonrasında dizi");
        diziYazdir(sayilar);
        selectionSort(sayilar);
        System.out.println("Yer değiştirme sonrasında dizi");
        diziYazdir(sayilar);
    }

    public static void diziDegistir(int[] dizi) {
        for (int i = dizi.length - 1; i > 0; i--) {
            int rastgeleIndex = (int) (Math.random() * (i + 1));

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex] = gecici;

        }


    }

    public static void selectionSort(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            //en küçük elemanın ve indeksinin bulunması
            int enKücükSayi = dizi[i];
            int enKücükSayininİndeksi = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (enKücükSayi > dizi[j]) {
                    enKücükSayi = dizi[j];
                    enKücükSayininİndeksi = j;
                }
            }
            if(enKücükSayininİndeksi != i){
                dizi[enKücükSayininİndeksi] = dizi[i];
                dizi[i] =enKücükSayi;
            }

        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int i : dizi) {
            System.out.println("Eleman :" + i);
        }
    }
}
