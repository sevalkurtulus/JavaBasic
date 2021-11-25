package com.company.oop.giris;

public class KalitimOrnek {
    public static void main(String[] args) {
        Dikdörtgen d1 = new Dikdörtgen(10,20);
        d1.ozellikYazdir();
        GeometrikSekil gs1 = new GeometrikSekil(5,10);
        System.out.println(gs1);
    }
}
class GeometrikSekil{
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    public GeometrikSekil(int en) {
        this.en = en;
    }

    public GeometrikSekil() {
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    public void alanHesapla(){
        System.out.println("Alan : "+(en*boy));
        //veya
        //Aynı sınıfın içinde oldukları için alabiliriz direk
        //System.out.println("Alan : "+(getBoy()*getEn()));
    }
    public void cevreHesapla(){
        System.out.println("Çevre " +(en+boy)*2);
    }
}
class Dikdörtgen extends GeometrikSekil{



    public Dikdörtgen(int en, int boy){
        setEn(en);
        setBoy(boy);


    }

   public void ozellikYazdir(){
       System.out.println("Geometrik şeklin eni "+getEn()+ "boyu" +getBoy());
       alanHesapla();
       cevreHesapla();
   }
}