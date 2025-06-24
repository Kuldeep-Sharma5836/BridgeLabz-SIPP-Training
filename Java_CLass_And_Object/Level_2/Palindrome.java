import java.util.Scanner;
public class Palindrome {
    String str;
    void setString(String str) {
        this.str = str;
    }
    boolean isPalindrome() {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = sc.nextLine();
        palindrome.setString(input);
        if (palindrome.isPalindrome()) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
