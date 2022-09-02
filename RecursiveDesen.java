package Giris;

import java.util.Scanner;

public class RecursiveDesen {
    static int desen(int n) {
        System.out.print(n + " ");
        if (n <= 0)
            return n;
        return desen(n - 5);
    }

    static int desen2(int n, int y) {

        if (n >= y)
            return n;
        System.out.print(n + 5 + " ");
        return desen2(n + 5, y);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println();
            int x = input.nextInt();
            System.out.println("Sayı : " + x);
            System.out.print("Çıktısı : ");
            desen2(desen(x), x);
        }


    }
}
