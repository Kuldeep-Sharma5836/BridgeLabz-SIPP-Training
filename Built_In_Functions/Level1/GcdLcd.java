import java.util.Scanner;

public class GcdLcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int gcd = findGCD(n, m);
        int lcm = findLCM(n, m);
        System.out.println("GCD of " + n + " and " + m + " is: " + gcd);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
