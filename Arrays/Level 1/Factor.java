import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int j = 0;
        int maxFactors = 10;
        int[] factors = new int[maxFactors];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (j == maxFactors) {
                    maxFactors *= 2;
                    int[] newFactors = new int[maxFactors];
                    for (int k = 0; k < factors.length; k++) {
                        newFactors[k] = factors[k];
                    }
                    factors = newFactors;
                }
                factors[j++] = i;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(factors[i]);
        }
    }
}
