import java.util.regex.*;
public class ValidateIP {
    public static boolean isValidIP(String ip) {
        return ip.matches("^(25[0-5]|2[0-4]\d|1?\d?\d)(\.(25[0-5]|2[0-4]\d|1?\d?\d)){3}$");
    }
    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1"));
        System.out.println(isValidIP("999.999.999.999"));
    }
}
