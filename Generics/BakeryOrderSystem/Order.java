public abstract class Order {
    String itemName;
    int qty;
    boolean delivered;

    public Order(String itemName, int qty) {
        this.itemName = itemName;
        this.qty = qty;
        this.delivered = false;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return  "\n     Category  :  " + getCategory()
                + "\n     Name      :  " + this.itemName
                + "\n     Quantity  :  " + this.qty
                + "\n     Delivered :  " + (isDelivered() ? "\u001b[32m" + "YES" + "\u001b[0m" : "\u001b[31m" + "NO" + "\u001b[0m");
    }

}
