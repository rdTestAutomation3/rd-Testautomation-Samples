package com.rd.Lesson15.DesingPattern.lombook;

import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Bilgisayar4 {
    private String marka = "Dell";
    @NonNull
    private String islemci;
    private int ram;
    private int depolama;
    private IsletimSistemi isletimSistemi;


    @Getter
    @Setter
    @SuperBuilder
    static class IsletimSistemi {
        private String architecture;
    }

}


