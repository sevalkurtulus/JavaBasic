package com.company.İnterfaceler;

import com.company.accessModifiers.Protected;

import java.util.ArrayList;

public class interfaceler {
    public static void main(String[] args) {
        /*Elma a = new Elma();
        Yenilebilir aa = new Elma();
        Yenilebilir bb = new Inek();*/

        ArrayList<Yenilebilir> yenilebilenSeyler= new ArrayList<>();


    }
}
class A{

}
class B{

}

/*class C extends B,A{

}*/
interface Yenilebilir{
    void yenmeSekli();
}

class Elma extends Protected implements Yenilebilir{
    void elmaMethodu(){}

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(protectedDegisken);
    }

    @Override
    public void yenmeSekli() {

    }
}
class Inek implements Yenilebilir{
    void inekMethodu(){}
    @Override
    public void yenmeSekli() {

    }
}

