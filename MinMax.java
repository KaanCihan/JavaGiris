package Giris;

import java.util.Scanner;

public class MinMax {
    public static void main(String args[]) {
        int x = 1, sayi, max = 0, min = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz : ");
        int n = input.nextInt();
        while(n >= 1){
            System.out.print(x + ". sayıyı giriniz.");
            sayi = input.nextInt();

            if(x == 1){
                min = sayi;
                max = sayi;
            }
            if(sayi < min){
                min = sayi;
            }
            if(sayi > max){
                max = sayi;
            }


            n--;
            x++;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);


    }
}
