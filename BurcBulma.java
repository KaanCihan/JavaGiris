package Giris;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String args []) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Ka��nc� ayda do�dunuz?");
        month = input.nextInt();

        System.out.print("Do�du�unuz ay�n ka��nc� g�n�nde do�dunuz?");
        day = input.nextInt();

        if((month == 2 && day >= 20) || (month == 3 && day <=20)) System.out.println("Bal�k burcu");

        if((month == 1 && day >= 22) || (month == 2 && day <=19)) System.out.println("Koca burcu");

        if((month == 12 && day >= 22) || (month ==1 && day <=21)) System.out.println("O�lak burcu");

        if((month ==11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Yay burcu");

        if((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Akrep burcu");

        if((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Terazi burcu");

        if((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Ba�ak burcu");

        if((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Aslan burcu");

        if((month == 6 && day >= 23) || (month == 7 && day <= 22)) System.out.println("Yenge� burcu");

        if((month == 5 && day >= 22) || (month == 6 && day <=22)) System.out.println("�kizler burcu");

        if((month == 4 && day >=21) || (month == 5 && day <= 21)) System.out.println("Bo�a burcu");

        if((month == 3 && day >= 21) || (month == 4 && day <=20)) System.out.println("Ko� burcu");


        if(!( 0 <= month && month<=13) || !(0 <= day && day <=32)){
            System.out.println("Ge�ersiz de�er girdiniz.");
        }


















    }
}

