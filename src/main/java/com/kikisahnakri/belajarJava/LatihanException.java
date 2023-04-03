package com.kikisahnakri.belajarJava;

public class LatihanException {

    public static void main(String args[]){

        int a = 6;
        int b = 0;

        int hasilBagi = 0;

        try{
            hasilBagi = a/b;

        }catch (ArithmeticException e){
            System.out.println("Error : Tidak Bisa dibagi dengan 0");
        } catch (Exception e){
            System.out.println("Error :" + e);
        }finally {
            System.out.println("Finnally ");
        }

        System.out.println("Hasil Bagi : " +hasilBagi);

    }
}
