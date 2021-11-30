package com.company.AbstractClass;

public class  AbstractSınıf {
    public static void main(String[] args) {
        GeometrikSekil kare = new Kare(12);
        kare.cevreHesapla();
        kare.alanHesapla();
        //typecasting
        ((Kare)kare).adiniSoyle();


        Dikdörtgen dikdörtgen = new Dikdörtgen(5,10);
        dikdörtgen.cevreHesapla();
        dikdörtgen.alanHesapla();
        dikdörtgen.adiniSoyle();

        GeometrikSekil daire =new Daire(5);
        daire.cevreHesapla();
        daire.cevreHesapla();

        alanlariKarsilastir(kare,dikdörtgen);
    }

    public static void alanlariKarsilastir(GeometrikSekil gs1,GeometrikSekil gs2){
if(gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
    System.out.println("Birinci parametredeki nesnenin alanı daha küçük ");
}else if(gs1.getHesaplananAlan() > gs2.getHesaplananAlan()){
    System.out.println("Birinci parametredeki nesnenin alanı daha büyük ");
}else{
    System.out.println("Alanlar birbirine eşittir");
}
    }
}

abstract class GeometrikSekil {

    private int birinciKenar;
    private int hesaplananAlan;

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}

class Kare extends GeometrikSekil {
    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin çevresi " + getBirinciKenar() * 4);

    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getBirinciKenar());
        System.out.println("Karenin alanı" +getHesaplananAlan());
    }

    public void adiniSoyle() {
        System.out.println("Ben bir kare nesnesiyim");
    }
}

class Dikdörtgen extends GeometrikSekil {

    private int ikinciKenar;

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    public Dikdörtgen(int birincKenar, int ikinciKenar) {
        setBirinciKenar(birincKenar);
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdörtgenin çevresi" + 2 * (ikinciKenar + getBirinciKenar()));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * ikinciKenar);
        System.out.println("Dikdörtgenin alanı" +getHesaplananAlan() );
    }
    public void adiniSoyle(){
        System.out.println("Ben bir dikdörtgenim");
    }
}

class Daire extends GeometrikSekil {

    public Daire(int yaricap) {
        setBirinciKenar(yaricap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin çevresi" + 2 * 3.14 * getBirinciKenar());

    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (3.14 * getBirinciKenar() * getBirinciKenar()));
        System.out.println("Dairenin alanı " +getHesaplananAlan());

    }
    public void adiniSoyle(){
        System.out.println("Ben bir daireyim");
    }
}