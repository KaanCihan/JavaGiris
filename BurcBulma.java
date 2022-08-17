package Giris;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String args []) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaçýncý ayda doðdunuz?");
        month = input.nextInt();

        System.out.print("Doðduðunuz ayýn kaçýncý gününde doðdunuz?");
        day = input.nextInt();

        if((month == 2 && day >= 20) || (month == 3 && day <=20)) System.out.println("Balýk burcu");

        if((month == 1 && day >= 22) || (month == 2 && day <=19)) System.out.println("Koca burcu");

        if((month == 12 && day >= 22) || (month ==1 && day <=21)) System.out.println("Oðlak burcu");

        if((month ==11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Yay burcu");

        if((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Akrep burcu");

        if((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Terazi burcu");

        if((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Baþak burcu");

        if((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Aslan burcu");

        if((month == 6 && day >= 23) || (month == 7 && day <= 22)) System.out.println("Yengeç burcu");

        if((month == 5 && day >= 22) || (month == 6 && day <=22)) System.out.println("Ýkizler burcu");

        if((month == 4 && day >=21) || (month == 5 && day <= 21)) System.out.println("Boða burcu");

        if((month == 3 && day >= 21) || (month == 4 && day <=20)) System.out.println("Koç burcu");


        if(!( 0 <= month && month<=13) || !(0 <= day && day <=32)){
            System.out.println("Geçersiz deðer girdiniz.");
        }


















    }
}

