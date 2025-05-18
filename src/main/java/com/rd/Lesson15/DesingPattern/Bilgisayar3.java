package com.rd.Lesson15.DesingPattern;

public class Bilgisayar3 {

    private String marka;
    private String islemci;
    private int ram;
    private int depolama;

    public static final class Bilgisayar3Builder {
        private String marka;
        private String islemci;
        private int ram;
        private int depolama;

        private Bilgisayar3Builder() {
        }

        public static Bilgisayar3Builder aBilgisayar3() {
            return new Bilgisayar3Builder();
        }

        public Bilgisayar3Builder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public Bilgisayar3Builder withIslemci(String islemci) {
            this.islemci = islemci;
            return this;
        }

        public Bilgisayar3Builder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Bilgisayar3Builder withDepolama(int depolama) {
            this.depolama = depolama;
            return this;
        }

        public Bilgisayar3 build() {
            Bilgisayar3 bilgisayar3 = new Bilgisayar3();
            bilgisayar3.marka = this.marka;
            bilgisayar3.depolama = this.depolama;
            bilgisayar3.ram = this.ram;
            bilgisayar3.islemci = this.islemci;
            return bilgisayar3;
        }
    }

    @Override
    public String toString() {
        return "Bilgisayar Aşağıdkai özelliklere sahiptir " +
                "marka='" + marka + '\'' +
                ", islemci='" + islemci + '\'' +
                ", ram=" + ram +
                ", depolama=" + depolama;
    }
}
