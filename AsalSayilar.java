package Giris;

import java.util.Scanner;

public class AsalSayilar {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        for(int i = 1;i <= 100;i++){
            int sayac = 0;
            for(int k = 1;k <= i;k++){
                if(i % k == 0){
                    sayac++;
                }
            }
            if( sayac == 2){
                System.out.print(i + " ");
            }


        }





    }
}
