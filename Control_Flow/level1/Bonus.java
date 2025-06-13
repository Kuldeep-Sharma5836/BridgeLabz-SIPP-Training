import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salary = sc.nextInt();
        int years = sc.nextInt();
        if(years > 5) {
            int bonus = (salary * 10) / 100;
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
