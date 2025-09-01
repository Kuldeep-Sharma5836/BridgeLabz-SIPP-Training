import java.util.regex.*;
public class ValidateLicense {
    public static boolean isValidLicense(String plate) {
        return plate.matches("^[A-Z]{2}\d{4}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidLicense("AB1234"));
        System.out.println(isValidLicense("A12345"));
    }
}
