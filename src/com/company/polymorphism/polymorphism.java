/*
package com.company.polymorphism;

public class polymorphism {
    public static void main(String[] args) {

        Hayvan h1 = new Hayvan();
        Kopek kopek1 =new Kopek("golden");
        Kedi kedi1 = new Kedi("Van kedisi");
    }
        public static void adiniSoyle(Kedi k){

        }
        public static void adiniSoyle(Kopek k){

        }




    class Hayvan {
        private int ayakSayisi;

        public int getAyakSayisi() {
            return ayakSayisi;
        }

        public void setAyakSayisi(int ayakSayisi) {
            this.ayakSayisi = ayakSayisi;
        }
        public void adiniSoyle() {
            System.out.println("Hayvan sınıfından bir nesne");
        }
    }
    class Kopek extends Hayvan {
        private String tur;

        public Kopek(String tur) {
            setAyakSayisi(4);
            setTur(tur);
        }

        public String getTur() {
            return tur;
        }

        public void setTur(String tur) {
            this.tur = tur;
        }

        @Override
        public void adiniSoyle() {
            System.out.println("Köpek nesnesi");
        }
    }
    class Kedi extends Hayvan {
        private String cinsi;

        public Kedi(String cinsi) {
            setAyakSayisi(4);
            setCinsi(cinsi);
        }

        public String getCinsi() {
            return cinsi;
        }

        public void setCinsi(String cinsi) {
            this.cinsi = cinsi;
        }

        @Override
        public void adiniSoyle() {
            System.out.println("Kedi nesnesi");
        }
    }
}
*/
