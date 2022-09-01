package Giris;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number){
        int temp = number, lastNumber, reverseNumber = 0;
        String string1, string2;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 +lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayıyı giriniz : ");
        n = input.nextInt();
        System.out.print(isPalindrom(n) ? n + " sayısı palindrom bir sayıdır." : n + " sayısı palindrom bir sayı değildir.");

    }








}
