package com.company.accessModifiers;

public class DefaultOrPackage {
    int sayi = 5;
    void method(){

    }
    class InnerClass{

    }
}
class Y extends DefaultOrPackage{
    @Override
    void method() {
        super.method();
        System.out.println(sayi);
    }
}
