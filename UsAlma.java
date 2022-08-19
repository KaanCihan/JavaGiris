package Giris;

import java.util.Scanner;

public class UsAlma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alt, üs, sonuc = 1;
        System.out.print("Üssü alýnacak sayýyý giriniz : ");
        alt = input.nextInt();
        System.out.print("Üssü giriniz : ");
        üs = input.nextInt();

        for(int i = 1; i <= üs; i++){

            sonuc *= alt ;

        }

        System.out.print(sonuc);






    }
}
