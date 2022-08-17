package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double artikYil, yil;

        System.out.print("Lütfen yýlý giriniz : ");
        yil = input.nextDouble();

        if(yil % 4 == 0){
            if((yil % 100 == 0) && (yil % 400 == 0)) {
                System.out.println("Girdiðiniz yýl artýk bir yýldýr.");
            }else System.out.println("Girdiðiniz yýl artýk bir yýl deðildir!");


        }else System.out.println("Girdiðiniz yýl artýk bir yýl deðildir!");






























    }
}
