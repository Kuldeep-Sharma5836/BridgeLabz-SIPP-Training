import java.util.regex.*;
public class ValidateUsername {
    public static boolean isValidUsername(String username) {
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123"));
        System.out.println(isValidUsername("123user"));
        System.out.println(isValidUsername("us"));
    }
}
