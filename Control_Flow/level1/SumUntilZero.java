import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break; 
            }
            sum += number; 
        }
        System.out.println("The sum is: " + sum);
    }
}
