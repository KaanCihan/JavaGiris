import java.util.Arrays;

public class TekrarEdenSayılar1 {
    public static void main(String[] args) {
        int[] list = {1, 4, 2, 4, 78, 3, 3, 3, 3, 3, 7, 2, 89, 89, 78};
        StringBuilder print = new StringBuilder("Tekrar eden sayılar : ");
        Arrays.sort(list);
        int tekrar = 0;
        int min = list[0];
        for (int j = 0; j < list.length; j++) {

            if (list[j] == min) {
                if (!(tekrar == min)) {
                    tekrar = min;
                    print.append(" ").append(tekrar);
                }
            }
            min = list[j];
        }
        System.out.println(print);
    }

}
