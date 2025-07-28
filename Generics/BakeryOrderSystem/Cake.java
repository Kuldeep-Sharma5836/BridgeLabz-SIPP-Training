public class Cake extends Order {
    public Cake (String itemName,int qty) {
        super(itemName,qty);
    }

    @Override
    public String getCategory() {
        return "Cake";
    }
}
