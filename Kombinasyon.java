package Giris;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r, totaln = 1, totalr = 1, totalnr = 1;
        System.out.print("C(n,r) n de�erini giriniz : ");
        n = input.nextInt();
        System.out.print("C(n,r) r de�erini giriniz : ");
        r = input.nextInt();

        for(int i =1; i <= n; i++){

            totaln = totaln *i;
        }

        for(int i =1; i <= r; i++){

            totalr = totalr * i;

        }

        for(int i = 1; i <= (n - r); i++){

            totalnr = totalnr * i;

        }

        System.out.println("Kombinasyon hesab� : "  + totaln / (totalr * totalnr));








    }
}
