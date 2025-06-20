import java.util.Scanner;
public class MaxThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int maxNumber = max(num1, num2, num3);
        System.out.println("The maximum number is: " + maxNumber);
    }
    public static int max(int a, int b, int c) {
        
        int max=0;
        if(a>b && a>c) {
            max = a;
        } else if(b>a && b>c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
}