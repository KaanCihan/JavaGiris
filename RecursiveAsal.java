package Giris;

import java.util.Scanner;

public class RecursiveAsal {

    static boolean asal(int n, int j){

        if(n == j)
            return true;

        if(n % j == 0)
            return false;

        return asal(n, j + 1);
    }


    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print(asal(x,2) ? x + " sayısı ASALDIR !" : x + " sayısı ASAL değildir !" );


    }
}
