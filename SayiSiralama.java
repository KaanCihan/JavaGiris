package Giris;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.println("�� farkl� say� giriniz.");
        System.out.println("�lk say�y� giriniz : ");
        a = input.nextInt();
        System.out.println("�kinci say�y� giriniz : ");
        b = input.nextInt();
        System.out.println("���nc� say�y� giriniz : ");
        c = input.nextInt();

        System.out.println("Say�lar�n b�y�kten k����e s�ralan��� : ");
        if(a>b && b>c){
            System.out.println(a + ">" + b  +">" +c);
        }
        if(b>a && a>c){
            System.out.println(b + ">" + a +">" + c);
        }
        if(c>b && b>a){
            System.out.println(c + ">" + b + ">" + a);
        }
        if(a>c && c>b){
            System.out.println(a + ">" + c + ">" + b);
        }
        if(c>a && a>b){
            System.out.println(c + ">" + a + ">" + b);
        }
        if(b>c && c>a){
            System.out.println(b + ">" + c + ">" +a);
        }




















    }
}
