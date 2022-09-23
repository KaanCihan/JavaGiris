import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int random;
        random = (int) (Math.random() * 10);
        int wrong = 0;
        System.out.println(random);


        while (wrong < 5){
            int selected = input.nextInt();
            if(selected == random){

                System.out.println("Tebrikler doğru tahmin ettiniz");
                break;
            }else {
                System.out.println("Yanlış tahmin tekrar deneyiniz!");
                wrong++;
            }
        }


    }
}
