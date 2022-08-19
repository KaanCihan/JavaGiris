package Giris;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n;
        double toplam = 0, taban = 0;;
        System.out.print("Sayýyý giriniz : ");
        n = input.nextInt();

        for(double i = 1; i <= n; i++){

            taban++;
            toplam += (1 / taban);


        }
        System.out.println(toplam);





    }
}
