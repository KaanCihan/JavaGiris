import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    static int isSmaller(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i > value) {
                count++;
            }
        }
        return count + 1;
    }
    static int zeroCount(int[] arr){
        int count = 0;
        for (int i: arr) {
            if(i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz :");

        int[] list = new int[n];
        int[] newList = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        for (int j = 0; j < n; j++) {

            newList[n - isSmaller(list, list[j])] = list[j];

        }
        System.out.println("Oluşturduğunuz dizi : " + Arrays.toString(list));

        for (int i = (newList.length - 1); i >= zeroCount(list); i--) {
            if (newList[i] == 0) {
                newList[i] = newList[i + 1];
            }
        }
        System.out.println("Dizinin küçükten büyüğe sıralanışı : " + Arrays.toString(newList));

    }
}
