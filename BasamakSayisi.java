package Giris;

import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);
        int n, basamakSayisi = 0, basamakToplam = 0, numberCounter = 0;
        System.out.print("Sayýyý giriniz : ");
        n = input.nextInt();

        int tempNumber = n;
        while(n != 0) {
            n /= 10;
            basamakSayisi++;

        }
        System.out.println("Basamak Sayýsý : " + basamakSayisi);
        System.out.print("Girdiðiniz sayýnýn basamaklarýnýn toplamý : ");

        for (int i = 1; i <= basamakSayisi; i++) {

            basamakToplam += tempNumber % 10;
            int c = tempNumber % 10;
            tempNumber /= 10;
            numberCounter++;
            System.out.print(c + "+");


    }
        System.out.println("\b" + " = " + basamakToplam);



}
}