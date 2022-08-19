package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);
        int n, basamakSayisi = 0, basamakToplam = 0, numberCounter = 0;
        System.out.print("Sayýyý giriniz : ");
        n = input.nextInt();

        System.out.print("Girdiðiniz sayýnýn basamaklarýnýn toplamý : ");
        int geciciN = n;
        while(n != 0) {
            n /= 10;
            basamakSayisi++;
            basamakToplam += geciciN % 10;
            int c = geciciN % 10;
            geciciN /= 10;
            System.out.print(c + "+");

        }


        System.out.println("\b" + " = " + basamakToplam);
        System.out.print("Basamak Sayýsý : " + basamakSayisi);



}
}