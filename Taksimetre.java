package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){


        double kmTL = 2.20, tutar, km;
        Scanner input = new Scanner(System.in);
        System.out.println("Yolculu�un ka� KM s�rece�ini giriniz : ");
        km = input.nextDouble();

        boolean minimum = km <= 10/2.20;

        tutar = minimum ? 20 : 10 + km * 2.20;
        System.out.print("Yolculuk i�in �deyece�iniz tutar : " + tutar);





    }
}
