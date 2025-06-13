import java.util.*;
public class SumNaturalUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        int sum2=n*(n+1)/2;
        while (i <= n) {
            sum += i;
            i++; 
        }
        if(sum==sum2){
            System.out.println("The sum of first " + n + " natural numbers is same by both formula and loop: " + sum);
        } else {
            System.out.println("There is an error in the calculation.");
        }
    }
}
