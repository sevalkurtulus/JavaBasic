package com.company;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
        int anaDizi[] = {1,7,9,10};
        int kopyaDizi[] =new int[anaDizi.length];
        for(int index=0;index<anaDizi.length;index++){
            kopyaDizi[index]=anaDizi[index];
        }

    //arraycopy
        int kopyaDizi2[] = new int[anaDizi.length];
        System.arraycopy(anaDizi,0,kopyaDizi2,0,anaDizi.length);
    }

    public static void diziYazdir(int[] yazdirilacakDizi ){
        for (int sayi:yazdirilacakDizi){
            System.out.println("Kopya dizi elemani :"+sayi);
        }

    }
}
