package Giris;

import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String args []){
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava s�cakl���n� giriniz : ");
        sicaklik = input.nextInt();

        if(5 > sicaklik ){

            System.out.print("Bu s�cakl�kta kayak yapman�z �nerilir.");

        }
        if(sicaklik == 5){

            System.out.print("Bu s�cakl�kta kayak yapabilir veya sinemaya gidebilirsiniz.");
        }
        if(5 < sicaklik && sicaklik <15){

            System.out.print("Bu s�cakl�kta sinemaya gidebilirsiniz.");
        }
        if(sicaklik == 15){

            System.out.print("Bu s�cakl�kta piknik yapabilir veya sinemaya gidebilirsiniz.");
        }
        if(15 < sicaklik && sicaklik < 25){

            System.out.print("Bu s�cakl�kta piknik yapabilirsiniz.");
        }
        if(sicaklik == 25){

            System.out.print("Bu s�cakl�kta piknik yapabilir veya y�zmeye gidebilirsiniz.");
        }
        if(sicaklik > 25){

            System.out.print("Bu s�cakl�kta y�zmeye gidebilirsiniz.");
        }

    }


}
