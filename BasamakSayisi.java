package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);
        int n, basamakSayisi = 0, basamakToplam = 0, numberCounter = 0;
        System.out.print("Say�y� giriniz : ");
        n = input.nextInt();

        System.out.print("Girdi�iniz say�n�n basamaklar�n�n toplam� : ");
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
        System.out.print("Basamak Say�s� : " + basamakSayisi);



}
}