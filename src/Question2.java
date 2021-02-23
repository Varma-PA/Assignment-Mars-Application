import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

    public static String getNameOfNumber(int number) {

        switch (number) {
            case 1:
                return "One";

            case 2:
                return "Two";

            case 3:
                return "Three";

            case 4:
                return "Four";

            case 5:
                return "Five";

            case 6:
                return "Six";

            case 7:
                return "Seven";

            case 8:
                return "Eight";

            case 9:
                return "Nine";
            default:
                return "Unknown Number";
        }
    }

    public static int checkNumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int[] reverseTheArray(int number[]) {

        int temp, start = 0, end = number.length - 1;

        while (start < end) {
            temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }

        return number;

    }

    public static void printNumberName(int number[]) {

        System.out.println(Arrays.toString(number));

        String[] theString = new String[number.length];

        StringBuilder sb = new StringBuilder();

        String name;

        for (int i = 0; i < number.length; i++) {
            name = getNameOfNumber(number[i]);
            theString[i] = name;
            sb.append(theString[i] + " ");
        }

        System.out.println(Arrays.toString(theString));

        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception {

        int temporaryNumber, count = 0, digit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number: ");

        int givenNumber = sc.nextInt();

        // Throw new Error
        if (givenNumber < 0) {
            throw new Error("Number is negative");
        }

        int digits[] = new int[checkNumberOfDigits(givenNumber)];

        temporaryNumber = givenNumber;

        // To calculate number of digits
        while (givenNumber > 0) {
            givenNumber = givenNumber / 10;
            count++;
        }

        for (int i = 0; temporaryNumber > 0; i++) {
            digit = temporaryNumber % 10;
            temporaryNumber = temporaryNumber / 10;
            digits[i] = digit;
        }

        // You'll get these digits in reverse order 123 -> [3, 2, 1]
        System.out.println(Arrays.toString(digits));

        // System.out.println(Arrays.toString(reverseTheArray(digits)));

        // Reversing the digits and printing them
        printNumberName(reverseTheArray(digits));

    }
}
