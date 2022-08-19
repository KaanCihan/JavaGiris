package Giris;

import java.util.Scanner;

public class DortVeBesinUsleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.print("Sayýyý giriniz : ");
        x = input.nextInt();



        for (int i = 4; i < x; i *= 4 ){
            System.out.print (i + " ");

        }

        for (int i = 5; i < x; i *= 5 ){
            System.out.print(i + " ");
        }










    }
}
