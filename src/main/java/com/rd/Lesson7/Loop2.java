package com.rd.Lesson7;

public class Loop2 {

    public static void main(String[] args) {

        int[] dizi = {3,2,4,5,4,3,5,12,10,90,100};
        int aranan = 5;

        for (int eleman : dizi) {
            System.out.println("Eleman= "+ eleman);

            if (eleman == aranan) {
                System.out.println("Eleman bulundu: " + aranan);
                break;
            }
        }
        System.out.println("Döngü Sonlandı!");
    }
}
