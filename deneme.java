package Giris;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        int tarih, fizik, turkce, matematik, kimya;

        Scanner input = new Scanner(System.in);
        System.out.print("Tarih notunuzu girin : ");
        tarih = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();

        int toplam = (matematik + fizik + kimya + tarih + turkce);
        double ortalama = toplam / 5.0 ;
        System.out.println("Ortalamanýz : " + ortalama);

        double ortalamaHesabi;
        ortalamaHesabi = ortalama;



        boolean ort = ortalama >= 60;
        String gecme;

        gecme = ort ? "Sýnýfý Geçebildiniz." : "Sýnýfta Kaldýnýz.";
        System.out.println(gecme);



    }

    }



