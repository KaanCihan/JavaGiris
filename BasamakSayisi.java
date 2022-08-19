package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);
        int n, basamakSayisi = 0, basamakToplam = 0, numberCounter = 0;
        System.out.print("Sayýyý giriniz : ");
        n = input.nextInt();

        System.out.print("Girdiðiniz sayýnýn basamaklarýnýn toplamý : ");

        while(n != 0) {

            basamakSayisi++;
            basamakToplam += n % 10;
            int c = n % 10;
            n /= 10;
            System.out.print(c + "+");

        }


        System.out.println("\b" + " = " + basamakToplam);
        System.out.print("Basamak Sayýsý : " + basamakSayisi);



}
}