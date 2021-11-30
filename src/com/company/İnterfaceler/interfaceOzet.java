package com.company.İnterfaceler;

public class interfaceOzet {
    public static void main(String[] args) {

    }
}
interface interfaceA{
    //Bir interface başka bir interfaceden extends edilebilir ama interface olmalıdır sınıf değil.
    //public yaparsam hata verir çünkü tüm projeler tarafından kullanılabilir public olursa bunu ayrı bir dosya olarak al der bize ide.
    //interfaceler abstractır
    //içinde sadece içi boş methodlar vardı ama java 8 den sonra değişti
    //değişken tanımladıgında static ve finaldır.
    //java 8 ile beraber static method tanmlayabiliriz
    //Bir interface içinde hiç bir metot tanımı yapılmamışsa bunlara Marker Interface denir.Comparable ve serailizable interfaceler
    //interfacedeki tüm değişkenler public,static ve finaldir
    //interfacedeki methodlar override edildiğinde public olmalıdır
    //interfacelerde initializer kullanılamaz
    void metotA();
    default void defaultmetot(){
        System.out.println("Ben default metotum");
    }

   static final int sayi=10;
}