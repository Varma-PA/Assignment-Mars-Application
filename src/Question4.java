import java.util.Arrays;

public class Question4 {

    public static int[] switchTheElements(int[] number, int d) {

        for (int i = 0; i < d; i++) {
            int j, firstElemet;
            firstElemet = number[0];
            // Shifting to left
            for (j = 0; j < number.length - 1; j++) {
                number[j] = number[j + 1];
            }
            number[j] = firstElemet;
        }
        return number;

    }

    public static void main(String[] args) {
        // Giving the initial Array
        int[] number = { 1, 5, 3, 1 };

        System.out.println(Arrays.toString(switchTheElements(number, 1)));

    }

}
