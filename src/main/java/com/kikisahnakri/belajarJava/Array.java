package com.kikisahnakri.belajarJava;

public class Array {

    public static void main( String args[]){

        String[] siswa;
        String[] hari = new String[7];
        String[] cars = {"Toyota", "Mitsubishi", "Tesla"};

        hari[0] = "Minggu";
        hari[1] = "Senin";
        hari[2] = "Selasa";
        hari[3] = "Rabu";
        hari[4] = "Kasmis";
        hari[5] = "Jum'at";
        hari[6] = "Sabtu";

        System.out.println(hari[0]);

        for(int i=0; i< hari.length; i++){
            System.out.println(hari[i]);
        }

        System.out.println("===================");

        for(String day: hari){
            System.out.println(day);
        }

    }

}
