import java.util.Scanner;

public class DivisibiltyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        if(n%5==0){
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }
    }
}
