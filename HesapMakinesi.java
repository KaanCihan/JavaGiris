package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1, a2, deger;

        System.out.print("�lk say�y� giriniz : ");
        a1 = input.nextInt();
        System.out.print("�kinci say�y� giriniz : ");
        a2 = input.nextInt();

        System.out.print("1-Toplama\n" + "2-��karma\n" + "3-B�lme\n"+ "4-�arpma\n" + "Se�iminizi yaz�n�z : ");
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
                    System.out.println("Bir say� 0'a b�l�nemez.");
                else
                    System.out.print(a1/a2);
                break;

            case 4:
                System.out.print(a1*a2);
                break;

            default :
                System.out.println("Ge�erli bir se�im yap�n�z.");
        }




    }
}
