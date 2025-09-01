import java.util.regex.*;
public class ValidateCreditCard {
    public static boolean isValidVisa(String number) {
        return number.matches("^4\d{15}$");
    }
    public static boolean isValidMasterCard(String number) {
        return number.matches("^5\d{15}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidVisa("4123456789012345"));
        System.out.println(isValidMasterCard("5123456789012345"));
    }
}
