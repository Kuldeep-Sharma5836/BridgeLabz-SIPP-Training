import java.util.*;
public class FirstSecThirdLargeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;
        if (num1 > num2) {
            if (num1 > num3) {
                isFirstLargest = true;
            }
        }

        if (num2 > num1) {
            if (num2 > num3) {
                isSecondLargest = true;
            }
        }

        if (num3 > num1) {
            if (num3 > num2) {
                isThirdLargest = true;
            }
        }
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
