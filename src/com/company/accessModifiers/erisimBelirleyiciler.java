package com.company.accessModifiers;

public class erisimBelirleyiciler {
    public static void main(String[] args) {
        //Tüm kurucu methodları private olan bir sınıftan nesne üretilemez
        //İç sınıflar private olabilir ama dış sınıflar private olamaz
        //Protected belirlenen değişkenler paket farketmeksizin tüm alt sınıflarda kullanılabilir
        //Başında public ifadesi bulunmayan sınıfllar sadece o pakete özgüdür başka paketlerden erişilemez. Bu yüzden nesne üretilemez veya kalıtılamaz
        Y y = new Y();

    }
}

