package Giris;

import java.util.Scanner;

    public class V�cutKitleEndeksi {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double kilo, boy;

            System.out.print("L�tfen boyunuzu metre cinsinde giriniz : ");
            boy = input.nextDouble();
            System.out.print("L�tfen kilonuzu giriniz : ");
            kilo = input.nextDouble();

            System.out.print("V�cut kitle endeksiniz : " + kilo / Math.pow(boy,2));


        }



}
