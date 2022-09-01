package Giris;

import java.util.Scanner;

public class RecursivePower {

    static int recursivePower(int taban, int us) {

        if (us == 1)
            return taban;

        return recursivePower(taban, 1) * recursivePower(taban, us - 1);

    }

    public static void main(String[] args) {

        int alt, ust;
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz :");
        alt = input.nextInt();
        System.out.print("Üssü giriniz : ");
        ust = input.nextInt();
        System.out.print("Sonuç : " + recursivePower(alt, ust));

    }
}
