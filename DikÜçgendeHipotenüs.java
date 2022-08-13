package Giris;

import java.util.Scanner;

public class DikÜçgendeHipotenüs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b;
        double alan, hipotenüs;
        System.out.print("Lüften üçgenin birinci dik kenarýnýn uzunluðunu giriniz : ");
        a = input.nextInt();
        System.out.print("Lüften üçgenin ikinci dik kenarýnýn uzunluðunu giriniz : ");
        b = input.nextInt();
        alan = a * b / 2;
        hipotenüs = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println("Üçgenin alaný : " + alan);
        System.out.print("Üçgenin Hipotenüsü : "+ hipotenüs);



    }
}
