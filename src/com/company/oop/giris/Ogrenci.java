package com.company.oop.giris;

public class Ogrenci {
    //öğrenci nesnesinin bildiği değerler

    private int ogrenciNo;
    private String isim;
    private byte sinif;
    private boolean aktif;

    public void setOgrenciNo(int yeniOgrenciNo) {
        this.ogrenciNo = yeniOgrenciNo;
    }

    public int getOgrenciNo() {
        return this.ogrenciNo;
    }

    public Ogrenci() {

    }

    public Ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(int ogrenciNo, String isim) {
        //this.ogrenciNo = ogrenciNo;
        //this. dediğimiz zaman o anki işaret ettiği objeye bakarken this(obj) dediğimizde o an ki constructur methodu gösterir
        this(ogrenciNo);
        this.isim = isim;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif) {
        /*this.ogrenciNo = ogrenciNo;
        this.isim=isim;
        */
        this(ogrenciNo, isim);
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        /*this.ogrenciNo = ogrenciNo;
        this.isim=isim;
        this.sinif =sinif;
         */
        this(ogrenciNo, isim, sinif);
        this.aktif = aktif;

    }


    /* public Ogrenci(){
         System.out.println("Nesne oluşturuluyor");
         aktif=true;
         ogrenciNo=9999;
         isim="Henüz verilmedi";
         sinif=127;
     }
     public Ogrenci(int ogrenciNo,String isim, byte sinif,boolean aktif){
             this.ogrenciNo=ogrenciNo;
             this.isim=isim;
             this.sinif=sinif;
             this.aktif=aktif;

     }
     public Ogrenci(String isim){
         this.isim=isim;


     }

     public void dersAl() {
         System.out.println("ders alıyor");
     }
 */
    public void bilgileriYazdir(int i) {
        if (aktif == true) {
            System.out.println("Adım : " + isim + " numaram : " + ogrenciNo + " sınıfım : " + sinif);
        } else {
            System.out.println("Öğrenci aktif değil");
        }
    }

}



