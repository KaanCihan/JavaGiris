package Giris;

import java.util.Scanner;

public class UsAlma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alt, �s, sonuc = 1;
        System.out.print("�ss� al�nacak say�y� giriniz : ");
        alt = input.nextInt();
        System.out.print("�ss� giriniz : ");
        �s = input.nextInt();

        for(int i = 1; i <= �s; i++){

            sonuc *= alt ;

        }

        System.out.print(sonuc);






    }
}
