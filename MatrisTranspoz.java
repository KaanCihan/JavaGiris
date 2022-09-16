import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoz {
    static int[][] transpose(int[][] arr, int n, int k) {
        int[][] transpose = new int[k][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                transpose[j][i] = arr[i][j];

            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        System.out.print("Matrisinizin row sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("Matrisinizin column sayısını giriniz : ");
        k = input.nextInt();

        int[][] list = new int[n][k];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print("Matrisin " + "[" + i + "]" + "[" + j + "]" + " konumundaki elemanı giriniz : ");
                list[i][j] = input.nextInt();
            }
        }
        System.out.println("Girdiğiniz dizi : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Girdiğiniz dizinin transpozu : ");
        for (int i = 0; i < transpose(list, n,k).length; i++) {
            for (int j = 0; j < transpose(list,n,k)[i].length; j++) {
                System.out.print(transpose(list,n,k)[i][j] + " ");
            }
            System.out.println();
        }

    }
}
