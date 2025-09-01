import java.util.regex.*;
public class ValidateSSN {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\d{3}-\d{2}-\d{4}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidSSN("123-45-6789"));
        System.out.println(isValidSSN("123456789"));
    }
}
