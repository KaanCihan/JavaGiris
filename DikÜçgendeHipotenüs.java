package Giris;

import java.util.Scanner;

public class Dik��gendeHipoten�s {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b;
        double alan, hipoten�s;
        System.out.print("L�ften ��genin birinci dik kenar�n�n uzunlu�unu giriniz : ");
        a = input.nextInt();
        System.out.print("L�ften ��genin ikinci dik kenar�n�n uzunlu�unu giriniz : ");
        b = input.nextInt();
        alan = a * b / 2;
        hipoten�s = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println("��genin alan� : " + alan);
        System.out.print("��genin Hipoten�s� : "+ hipoten�s);



    }
}
