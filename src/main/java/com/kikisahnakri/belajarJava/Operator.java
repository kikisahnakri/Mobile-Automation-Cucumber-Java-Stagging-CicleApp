package com.kikisahnakri.belajarJava;

public class Operator {

    public static void main(String[] args) {
        int number;

        number = 10;
        number = 67 + 90;
        number = 67 - 90;
        number = 67 * 90;
        number = 67 / 90;
        number = 8 %3;

        System.out.println(number);

        int i;
        i=90;

        System.out.println(i++);
        System.out.println(i);

        int a;
        a=50;
        System.out.println(++a);
        System.out.println(a);

        int j = 8;
        j = ++j * ++j;
        System.out.println(j);



        // Perbandingan => true / false

        // == apakah sama
        // != apakah tidak sama
        // > apakah lebih besar
        // < apakah lebih kecil
        // >= apakah lebih besar / sama dengan
        // <= apakah lebih kecil / sama dengan

        boolean lulus = 90 == 80;


        // operator logika
        // And => & &&
        // Or => | ||
        // not > !

        int c = 9;
        int b = 90;

        boolean aktif = !(true | !false) & true;
        System.out.println(aktif);

        boolean fl = false;
        boolean tr = true;

        if(tr || fl){

        }

        // dia lulus jika
            // a: tidak ada tunggakan administrasi
            // b: rata rata nilai minimal 78
            // c: tidak ada nilai dibawah 50
            // d: absensi minimal 80%
    }
}
