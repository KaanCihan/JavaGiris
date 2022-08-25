package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String args[]) {
        int n1, n2, k = 1, t = 1, kucuk, ebob, ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        kucuk = Math.min(n1, n2);
        int a = kucuk;
        while (kucuk >=1){

            if(n1 % kucuk == 0 && n2 % kucuk == 0){
                ebob = kucuk;
                System.out.print("Ebob : " + ebob);
                break;
            }
            kucuk--;


        }
        while ( a <= (n1 * n2) ){
            if(a%n1 == 0 && a%n2 == 0){
                ekok = a;
                System.out.print("Ekok : " + ekok);
                break;
            }
            a++;

        }
    }
}
