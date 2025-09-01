import java.util.regex.*;
public class ValidateHexColor {
    public static boolean isValidColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidColor("#FFA500"));
        System.out.println(isValidColor("#123"));
    }
}
