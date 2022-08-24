package Giris;

import java.util.Scanner;

public class ElmasYildiz {
        public static void main(String args []) {

            Scanner input = new Scanner(System.in);
            System.out.println("Basamak sayisini giriniz : ");
            int katSayisi = input.nextInt();

            for(int i = 1; i < katSayisi; i++ ){

                for(int k = 1; k <= (katSayisi - i); k++){
                    System.out.print(" ");

                }
                for(int j = 1; j <= (2 * i - 1); j++){
                    System.out.print("*");

                }
                System.out.println();
            }
            for(int i =1; i <= katSayisi;i++ ){

                for(int j = 1 ;j < i;j++ ){
                    System.out.print(" ");
                }

                for(int k= 0;k <= (2 * katSayisi - 2 * i) ;k++ ){

                    System.out.print("*");
                }

                System.out.println();
            }


        }
    }

