package Giris;

import java.util.Scanner;

    public class VücutKitleEndeksi {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double kilo, boy;

            System.out.print("Lütfen boyunuzu metre cinsinde giriniz : ");
            boy = input.nextDouble();
            System.out.print("Lütfen kilonuzu giriniz : ");
            kilo = input.nextDouble();

            System.out.print("Vücut kitle endeksiniz : " + kilo / Math.pow(boy,2));


        }



}
