package com.rd.Lesson15.DesingPattern.lombook;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@ToString
@SuperBuilder
public class Bilgisayar5 extends Bilgisayar4{

    public Bilgisayar5(String marka, @NonNull String islemci, int ram, int depolama, Bilgisayar4.IsletimSistemi isletimSistemi) {
        super(marka, islemci, ram, depolama, isletimSistemi);
    }
}
