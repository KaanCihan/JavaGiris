package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patl�canKilo, toplam;

        System.out.print("Armut ka� kilo? : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma ka� kilo? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates ka� kilo? : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz ka� kilo? : ");
        muzKilo = input.nextDouble();
        System.out.print("Patl�can ka� kilo? :" );
        patl�canKilo = input.nextDouble();

        toplam = armutKilo * 2.14 + elmaKilo * 3.67 + domatesKilo * 1.11 + muzKilo * 0.95 + patl�canKilo * 5;
        System.out.println("Toplam tutar : " + toplam + "TL");


    }
}

