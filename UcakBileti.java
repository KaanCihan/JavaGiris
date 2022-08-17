package Giris;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, indirimOrani, yas, tip;


        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaþýnýzý giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipiniz giriniz (tek yön -> 1 çift yön -> 2 :");
        tip = input.nextInt();
        double normalTutar = km  * 0.10;


        if (12 > yas) {
            indirimOrani = 0.50;
        } else if (yas <= 24) {
            indirimOrani = 0.90;
        } else if (65 < yas) {
            indirimOrani = 0.70;
        } else indirimOrani =1;

        if((!(tip == 1 || tip ==2)) || (km < 0) || (0 > yas)) {
            System.out.println("Hatalý Veri Girdiniz!");
        }else
            if(tip == 2){
            System.out.println("Uçak bileti ücretiniz : " + normalTutar * indirimOrani * 0.80 *2 + "TL");

                }else {
            System.out.println(" Uçak bileti ücretiniz : " + normalTutar * indirimOrani + "TL");
        }



























    }
}
