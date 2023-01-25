package Stock;

public class Inventory {
    static int quantity;
    public static void setQuantity(int quantity) {
        Inventory.quantity = quantity;
    }
    static int lowOrderLevelQuantity;
    public static int getQuantity() {
        return quantity;
    }
    public Inventory(int lowOrderLevelQuantity){
        Inventory.lowOrderLevelQuantity=lowOrderLevelQuantity;
    }
    public static int getLowOrderLevelQuantity() {
        return lowOrderLevelQuantity;
    }
}
