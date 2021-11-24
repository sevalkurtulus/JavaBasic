package com.company.ArrayExample;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[][] matris = new int[3][2];
        int enKucukSayi = 0;
        int enBuyukSayi = 0;

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                int rastgeleSayi = (int) (Math.random() * 100);
                matris[satir][sutun] = rastgeleSayi;
                System.out.println(satir + "daki" + sutun + ".sutunun elemanı"+matris[satir][sutun]);
                if (enKucukSayi > rastgeleSayi) {
                    enKucukSayi = rastgeleSayi;
                }
                if (enBuyukSayi < rastgeleSayi) {
                    enBuyukSayi = rastgeleSayi;
                }
            }
        }
        System.out.println("Bu matristeki en kücük sayi"+enKucukSayi+"en buyuk sayı"+enBuyukSayi);
    }
}
