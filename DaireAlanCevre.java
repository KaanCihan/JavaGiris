package Giris;

import java.util.Scanner;

public class DaireAlanCevre{

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double pi = 3.14, yaricap, cevre, alan, dilimYüzdesi;

            System.out.print("Dairenin ya da daire diliminin cm cinsinden yarýçapýný giriniz : ");
            yaricap = input.nextDouble();
            System.out.print("Daire dilimi deðilse 360, dilim ise açýsýný yazýnýz : ");
            dilimYüzdesi = input.nextDouble();
            boolean yuzde = dilimYüzdesi >= 360;


            cevre = yuzde ? 2 * pi * yaricap : 2 * yaricap + 2 * yaricap * pi * dilimYüzdesi / 360;
            alan = pi * Math.pow(yaricap,2);

            System.out.println("Dairenin çevresi : " + cevre + "cm");
            System.out.print("Dairenin alaný : " + alan * dilimYüzdesi / 360 + "cm²");


        }





}
