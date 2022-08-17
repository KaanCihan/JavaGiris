package Giris;


import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n % 2 == 1){
            System.out.println("Weird");

        }else{
            if((2 <= n && n <= 5)  || (n > 20)) System.out.println("Not Weird");

            if(6 <= n && n <= 20) System.out.println("Weird");
        }


    }
}
