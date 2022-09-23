import java.util.Scanner;

public class PalindromikKelimleriBulanProgram {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        if (str.length() % 2 == 0) {
            return false;
        } else {
            for (int k = 1; k <= (str.length() + 1) / 2; k++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String kelime;
        Scanner input = new Scanner((System.in));
        kelime = input.next();
        System.out.println(isPalindrome(kelime) ? "Girdiğiniz kelime palindromik kelimedir. " : "Girdiğiniz kelime palindromik kelime değildir.");
    }

}
