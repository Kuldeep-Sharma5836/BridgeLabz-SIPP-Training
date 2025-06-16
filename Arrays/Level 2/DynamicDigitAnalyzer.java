import java.util.*;
public class DynamicDigitAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;                 
        int[] digits = new int[maxDigit]; 
        int index = 0;
        int temp = number;

        while (temp > 0) {
            if (index == maxDigit) {

                maxDigit += 10;
                int[] newDigits = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    newDigits[i] = digits[i];
                }
                digits = newDigits;
            }

            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }
        int max = -1, secondMax = -1;
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > max) {
                secondMax = max;
                max = d;
            } else if (d > secondMax && d != max) {
                secondMax = d;
            }
        }
        System.out.print("Digits: ");
        for (int i = 0; i < index; i++)
            System.out.print(digits[i] + " ");
        System.out.println("\nLargest Digit: " + max);
        System.out.println("Second Largest Digit: " + 
            (secondMax == -1 ? "Not Found" : secondMax));

        sc.close();
    }
}
