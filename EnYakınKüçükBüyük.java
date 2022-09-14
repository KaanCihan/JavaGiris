import java.util.Scanner;

public class EnYakınKüçükBüyük {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Sayıyı giriniz : ");
        x = input.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int xMin = max;
        int xMax = min;
        for (int i : list) {
            if (i > x) {
                if (i < xMin) {
                    xMin = i;
                }
            }
            if (i < x) {
                if (i > xMax) {
                    xMax = i;
                }
            }
        }
        if (xMax == x) {
            System.out.println("Girilen sayıdan küçük bir sayı yok!!");
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + xMin);
        } else if (xMin == x) {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + xMax);
            System.out.println("Girilen sayıdan büyük bir sayı yok!!");

        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + xMax);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + xMin);
        }
    }

}
