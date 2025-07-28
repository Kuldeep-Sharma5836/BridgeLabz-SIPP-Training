public class Cookie extends Order {
    public Cookie (String itemName, int qty) {
        super(itemName,qty);
    }

    @Override
    public String getCategory() {
        return "Cookie";
    }
}
