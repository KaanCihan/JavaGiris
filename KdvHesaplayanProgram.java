package Giris;

import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args){

        double kdvFiyat, kdvsizFiyat, kdv, fiyat;


        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat tutarýný giriniz :");
        fiyat = input.nextDouble();

        boolean oran = fiyat <= 1000;
        double kdvOrani;

        kdvOrani = oran ? 0.18 : 0.19 ;

        kdv = fiyat * kdvOrani;
        kdvsizFiyat = fiyat - kdv;

        System.out.println("KDV dahil fiyat : " + fiyat);
        System.out.println("KDV dahil olmadan fiyat : " + kdvsizFiyat);
        System.out.println("KDV orani : " + kdvOrani);
        System.out.print("KDV fiyatý : " + kdv);












    }
}
