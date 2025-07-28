public class Pastry extends Order {
    public Pastry(String name, int qty) {
        super(name,qty);
    }

    @Override
    public String getCategory() {
        return "Pastry";
    }
}
