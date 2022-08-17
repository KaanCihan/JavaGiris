package Giris;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String args []){
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sýcaklýðýný giriniz : ");
        sicaklik = input.nextInt();

        if(5 > sicaklik ){

            System.out.print("Bu sýcaklýkta kayak yapmanýz önerilir.");

        }
        if(sicaklik == 5){

            System.out.print("Bu sýcaklýkta kayak yapabilir veya sinemaya gidebilirsiniz.");
        }
        if(5 < sicaklik && sicaklik <15){

            System.out.print("Bu sýcaklýkta sinemaya gidebilirsiniz.");
        }
        if(sicaklik == 15){

            System.out.print("Bu sýcaklýkta piknik yapabilir veya sinemaya gidebilirsiniz.");
        }
        if(15 < sicaklik && sicaklik < 25){

            System.out.print("Bu sýcaklýkta piknik yapabilirsiniz.");
        }
        if(sicaklik == 25){

            System.out.print("Bu sýcaklýkta piknik yapabilir veya yüzmeye gidebilirsiniz.");
        }
        if(sicaklik > 25){

            System.out.print("Bu sýcaklýkta yüzmeye gidebilirsiniz.");
        }

    }


}
