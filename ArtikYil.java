package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double artikYil, yil;

        System.out.print("L�tfen y�l� giriniz : ");
        yil = input.nextDouble();

        if(yil % 4 == 0){
            if((yil % 100 == 0) && (yil % 400 == 0)) {
                System.out.println("Girdi�iniz y�l art�k bir y�ld�r.");
            }else System.out.println("Girdi�iniz y�l art�k bir y�l de�ildir!");


        }else System.out.println("Girdi�iniz y�l art�k bir y�l de�ildir!");






























    }
}
