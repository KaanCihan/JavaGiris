package Giris;

import java.util.Scanner;

public class Atm {
    public static void main(String args []) {

        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while(right>0){
            System.out.print("Kullancı adınzı giriniz :");
            String userName = input.nextLine();
            System.out.print("Parolanızı giriniz : ");
            String password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.print("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");
                do{
                    System.out.print("\n1- Para yatırma\n2- Para çekme\n3- Bakiye Sorulama\n4- Çıkış Yap\n\nİşlem seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatıracağınız para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.print("Yeni bakiyeniz : " + balance);
                            break;

                        case 2:
                            System.out.println("Çekeceğiniz para miktarı : ");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.print("Yeterli bakiyeniz bulunmamaktadır.");
                            }else{
                                balance -= price;
                                System.out.print("Yeni bakiyeniz : " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Toplam bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Başarıyla çıkış yaptınız.");
                            break;
                    }

                }while(select != 4);
                System.out.print("Tekrar görüşmek üzere...");
                break;

            } else{
                right--;

                if(right ==0) {
                    System.out.println("Yanlış şifre veya kullanıcı adı. Hesabınız bloke edilmiştir.");
                }else{
                    System.out.println("Yanlış şifre veya kullanıcı adı. Tekrar deneyiniz.\nKalan hakkınız : " + right);
            }


            }
        }






    }
}
