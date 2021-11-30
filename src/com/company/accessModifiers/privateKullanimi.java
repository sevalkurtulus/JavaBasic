package com.company.accessModifiers;

public class privateKullanimi  {
    //private sınıf tanımlamalarında kullanılmaz
    //Private değişken ve methodlar o sınıfa aittir
    //private kurucu methodu o sınıftan nesne üretilemsini engeller.ve o sınıftan kalıtım ile yeni sınıf oluşturulmaz
    //private ile innerclass tanımlanabilir
    private int a;
    private void method(){
    }

    private class InnerClass{

    }
}
class yeniSinif extends privateKullanimi{

}
