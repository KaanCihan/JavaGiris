package Giris;

import java.util.Scanner;

public class S�n�fGecme {
    public static void main(String args[]){

        double mat, fizik, turkce, kimya, muzik, n = 5, ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz (0 ve 100 aras�ndaki de�erlerin d���ndaki de�erler ortalamaya dahil edilmeyecektir.) : ");
        mat = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextDouble();
        System.out.print("T�rk�e notunuzu giriniz : ");
        turkce = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextDouble();
        System.out.print("M�zik notunuzu giriniz : ");
        muzik = input.nextDouble();

        if(-1>= mat | mat >=101){
            n = n-1;
            mat = 0;


        } else;{}

        if(-1>= fizik | fizik >=101){
            n = n-1;
            fizik = 0;


        } else;{}

        if(-1>= turkce | turkce >=101){
            n = n-1;
            turkce = 0;


        } else;{}

        if(-1>= kimya | kimya >=101){
            n = n-1;
            turkce = 0;


        } else;{}

        if(-1>= muzik | muzik >=101){
            n = n-1;
            muzik = 0;


        } else;{}

        ortalama = (mat +fizik + turkce + kimya + muzik) / n;
        System.out.println("Ortalaman�z : " + ortalama);

        boolean gecme = ortalama >= 55;
        System.out.print(gecme ? "S�n�f� ge�tiniz" : "S�n�f� ge�emediniz.");








    }

}
