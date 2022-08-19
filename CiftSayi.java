package Giris;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Sayýyý giriniz : ");
        a = input.nextInt();

        for (int i=0; i < a ; ++i){

            if(i % 2 == 1){
                continue;
            }
            System.out.print( i + " ");
        }







    }
}
