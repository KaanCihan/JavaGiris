public class HarmonikOrtalama {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1 / numbers[i];
        }
        System.out.println(numbers.length / harmonicSum);
    }
}
