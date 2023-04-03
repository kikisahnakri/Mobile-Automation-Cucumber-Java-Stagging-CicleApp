package com.kikisahnakri.belajarJava;

public class Condition {
    public static void main(String args[]){

        // if, if else, if elseif else,
        // switch

        int a = 50;

        if( a >= 75){
            System.out.println("Lulus");
        } else if(a>65) {
            System.out.println("Perbaikan");
        } else {
            System.out.println("Tidak Lulus");
        }

        String country = "Ind";

        switch (country){
            case "India":
                System.out.println("Wellcome to India");
                break;
            case "Indonesia":
                System.out.println("Wellcome to Indonesia");
                break;
            case "Malaysia":
                System.out.println("Wellcome to Malaysia");
                break;
            default:
                System.out.println("Negara tidak tercantum");
                break;
        }


    }
}
