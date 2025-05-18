package com.rd.Lesson15.DesingPattern;

public class Main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar = Bilgisayar.BilgisayarBuilder.aBilgisayar()
                .withMarka("Casper")
                .withIslemci("İntel")
                .withRam(16)
                .withDepolama(500)
                .build();

        System.out.println(bilgisayar);


        Bilgisayar3 bilgisayar3 = Bilgisayar3.Bilgisayar3Builder.aBilgisayar3()
                .withIslemci("Intel")
                .withRam(256)
                .withDepolama(1000)
                .withMarka("Dell")
                .build();

        System.out.println(bilgisayar3);

        String text = bilgisayar3.toString();

        System.out.println(text);


    }
}
