import java.util.Arrays;

public class Question3 {

    public static int test_prime(int givenNumber) {

        int checkDivisibilityNumber = 2;

        boolean divisibile = false;

        while (checkDivisibilityNumber <= givenNumber / 2) {

            if (givenNumber % checkDivisibilityNumber == 0) {
                divisibile = true;
                break;
            }

            checkDivisibilityNumber++;
        }

        if (divisibile) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        int theNumberOfPrimeNumbersYouWant = 150;

        int[] primeNumbers = new int[theNumberOfPrimeNumbersYouWant + 1];

        int theNumber, arrayIndex = 0;

        System.out.println(test_prime(683));

        for (int i = 0;; i++) {

            int counter = 0;

            for (int num = i; num >= 1; num--) {

                if (i % num == 0) {
                    counter = counter + 1;
                }

            }

            if (counter == 2) {
                primeNumbers[arrayIndex] = i;
                arrayIndex++;

                if (arrayIndex > theNumberOfPrimeNumbersYouWant) {
                    break;
                }
            }

        }
        // Printing the prime numbers in an array
        System.out.println(Arrays.toString(primeNumbers));

    }

}
