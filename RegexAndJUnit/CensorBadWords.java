public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String censored = text.replaceAll("(?i)\b(damn|stupid)\b", "****");
        System.out.println(censored);
    }
}
