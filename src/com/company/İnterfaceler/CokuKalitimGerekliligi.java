package com.company.İnterfaceler;

import java.util.ArrayList;

public class CokuKalitimGerekliligi {
    public static void main(String[] args) {
        popSarkiciOzellikleri popSarkici1 = new Tarkan();
        popSarkiciOzellikleri popSarkici2 = new Hadise();

        popSarkiciOzellikleri dizi[] =new popSarkiciOzellikleri[5];
        dizi[0]=popSarkici1;
        dizi[1]=popSarkici2;

        ArrayList<popSarkiciOzellikleri>sarkicilar=new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);
        popSarkici1.sahnedeDansEt();
    }

}
abstract class Sarkici{
    abstract void sarkıSöyle();
}

interface arabeskSarkiciOzellikleri {
    void sanedeSigaraIc();
}
interface popSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
}
class Tarkan implements popSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}
class Hadise implements popSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}
class ArabeskSarkici extends Sarkici{

    @Override
    void sarkıSöyle() {
        System.out.println("Arabesk şarkı söylüyor");
    }

}
class popSarkicisi extends Sarkici{

    @Override
    void sarkıSöyle() {
        System.out.println("Pop şarkı söylüyor");
    }

}
class muslumBaba implements arabeskSarkiciOzellikleri, popSarkiciOzellikleri {

    @Override
    public void sanedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}