package com.kikisahnakri.belajarJava;

public class Method {

    // Tidak mengembalikan nilai
    public void cetak(){
        System.out.println("Cetak dari method");
    }

    // Bisa diakses tanpa dekalrasi class
    public static void cetak2(){
        System.out.println("Cetak2 dari method");
    }

    // mengembalikan nilai
    public int luas(){
        return  50;
    }


    public static void main(String args[]){
        Method method = new Method();
        // String  abc = method.cetak();
        int luas = method.luas();

        Method.cetak2();

    }

}
