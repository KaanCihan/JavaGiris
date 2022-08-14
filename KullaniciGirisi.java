package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main (String [] args){
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);


        System.out.print("Kullanýcý adýnýzý giriniz : ");
        userName = input.nextLine();
        System.out.print("Þifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){

            System.out.print("Baþarýyla giriþ yaptýnýz.");
        }else if(! password.equals("java123") && userName.equals("patika")){
            System.out.print("Þifreniz yanlýþ. Lütfen yeni þifre oluþturunuz : ");
            newPassword = input.nextLine();
            if (newPassword.equals("java123")){
                System.out.print("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
            }
            else if (! newPassword.equals("java123")){
                System.out.print("Yeni þifreniz baþarýyla oluþturulmuþtur.");
            }
        }
        else{
            System.out.print("Kullanýcý ismi bulunamadý.");
        }




    }
}
