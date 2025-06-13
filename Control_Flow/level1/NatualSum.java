import java.util.Scanner;
public class NatualSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=n*(n+1)/2; 
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
