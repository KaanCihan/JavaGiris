package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlýcanKilo, toplam;

        System.out.print("Armut kaç kilo? : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muzKilo = input.nextDouble();
        System.out.print("Patlýcan kaç kilo? :" );
        patlýcanKilo = input.nextDouble();

        toplam = armutKilo * 2.14 + elmaKilo * 3.67 + domatesKilo * 1.11 + muzKilo * 0.95 + patlýcanKilo * 5;
        System.out.println("Toplam tutar : " + toplam + "TL");


    }
}

