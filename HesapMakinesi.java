package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1, a2, deger;

        System.out.print("Ýlk sayýyý giriniz : ");
        a1 = input.nextInt();
        System.out.print("Ýkinci sayýyý giriniz : ");
        a2 = input.nextInt();

        System.out.print("1-Toplama\n" + "2-Çýkarma\n" + "3-Bölme\n"+ "4-Çarpma\n" + "Seçiminizi yazýnýz : ");
        deger = input.nextInt();

        switch (deger){
            case 1:
                System.out.print(a1+a2);
                break;

            case 2:
                System.out.print(a1-a2);
                break;

            case 3:
                if (a2 == 0)
                    System.out.println("Bir sayý 0'a bölünemez.");
                else
                    System.out.print(a1/a2);
                break;

            case 4:
                System.out.print(a1*a2);
                break;

            default :
                System.out.println("Geçerli bir seçim yapýnýz.");
        }




    }
}
