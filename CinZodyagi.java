package Giris;

import java.util.Scanner;

public class CinZodyagi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kalan;
        System.out.print("Doðum yýlýnýzý giriniz : ");
        yil = input.nextInt();

        kalan = yil % 12;

        switch(kalan){
            case 0:
                System.out.println("Çin zodyaðý burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin zodyaðý burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin zodyaðý burcunuz : Köpek" );
                break;
            case 3:
                System.out.println("Çin zodyaðý burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin zodyaðý burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin zodyaðý burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin zodyaðý burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyaðý burcunuz : Tavþan");
                break;
            case 8:
                System.out.println("Çin zodyaðý burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyaðý burcunuz : Yýlan");
                break;
            case 10:
                System.out.println("Çin zodyaðý burcunuz : At");
                break;
            case 11:
                System.out.println("Çin zodyaðý burcunuz : Koyun");
                break;
            default:
                System.out.println("Hatalý veri girdiniz.(0 ve 11 arasýnda bir deðer giriniz)");

        }





















    }
}
