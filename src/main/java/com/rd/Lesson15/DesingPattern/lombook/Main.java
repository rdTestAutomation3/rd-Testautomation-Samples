package com.rd.Lesson15.DesingPattern.lombook;

import com.rd.Lesson15.DesingPattern.lombook.Bilgisayar;

public class Main {
    public static void main(String[] args) {

        Bilgisayar5.IsletimSistemi isletimSistemi = Bilgisayar5.IsletimSistemi.builder()
                .architecture("MacOs")
                .build();

       Bilgisayar5 bilgisayar5 = Bilgisayar5.builder()
               .islemci("Intel")
               .isletimSistemi(isletimSistemi)
               .ram(256)
               .depolama(1000)
               .marka("Apple")
               .build();

        System.out.println(bilgisayar5.getIsletimSistemi().getArchitecture());


    }



}
