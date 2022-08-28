package Giris;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        int n = 1,b = 0, c = 1, toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Serinin eleman sayısını giriniz : ");
        int eleman = input.nextInt();
        for(int i = 1;i <= eleman;i++){

            toplam = b + c;

            System.out.println(b + " + " + c + " = " + toplam);
            b = c;
            c = toplam;


        }
    }
}
