package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main (String [] args){
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);


        System.out.print("Kullan�c� ad�n�z� giriniz : ");
        userName = input.nextLine();
        System.out.print("�ifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){

            System.out.print("Ba�ar�yla giri� yapt�n�z.");
        }else if(! password.equals("java123") && userName.equals("patika")){
            System.out.print("�ifreniz yanl��. L�tfen yeni �ifre olu�turunuz : ");
            newPassword = input.nextLine();
            if (newPassword.equals("java123")){
                System.out.print("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
            }
            else if (! newPassword.equals("java123")){
                System.out.print("Yeni �ifreniz ba�ar�yla olu�turulmu�tur.");
            }
        }
        else{
            System.out.print("Kullan�c� ismi bulunamad�.");
        }




    }
}
