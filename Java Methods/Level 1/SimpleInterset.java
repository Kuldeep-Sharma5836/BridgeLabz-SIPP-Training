import java.util.*;
public class SimpleInterset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest: "+ simpleInterest);
    }
    public static double calculateSimpleInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100.0;
    }
}
