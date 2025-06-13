import java.util.Scanner;
public class SprinSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {
            System.out.println("It's Spring season.");
        } 
        else {
            System.out.println("It's not spring season.");
        }
    }
}
