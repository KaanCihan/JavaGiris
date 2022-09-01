package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void sum() {
        Scanner input = new Scanner(System.in);
        int n, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            result += input.nextInt();

        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int n, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            result -= input.nextInt();

        }
        System.out.println("Sonuç : " + result);

    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            result *= input.nextInt();
        }
        System.out.println("Sonuç : " + result);
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0.0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            result /= input.nextInt();
        }
        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        int taban, us, result = 1;
        System.out.print("Taban değerini giriniz : ");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        System.out.println("Sonuç : " + result);

    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
        System.out.print("Hangi sayının faktoriyelini almak istiyorsunuz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        System.out.println("Sonuç : " + result);

    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int n, mod;
        System.out.print("Hangi sayının modunu almak istiyorsunuz : ");
        n = input.nextInt();
        System.out.print("Modu giriniz : ");
        mod = input.nextInt();

        int result = n % mod;
        System.out.println("Sonuç : " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        int ilk, iki, result;
        System.out.print("Birinci kenar uzunluğunu giriniz : ");
        ilk = input.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        iki = input.nextInt();

        result = 2 * ilk + 2 * iki;
        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Yanlış seçim. Lütfen tekrar deneyiniz.\n");
                    continue;

            }

        } while (select != 0);

    }


}