package Giris;

import java.util.Scanner;

public class UcVeDort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, sum = 0, x = 0;
        System.out.print("Sayýyý giriniz : ");
        a = input.nextInt();

        for (int i=0; i < a ; ++i) {

            if (!(i % 3 == 0) || !(i % 4 == 0)) {

                continue;
            }
            sum += i;
            x++;
        }

        System.out.println(sum / x);








    }
}
