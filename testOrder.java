import java.util.ArrayList;

import Material.Accessories;
import Material.Laptop;

public class testOrder {
    public static void main(String[] args) {
        Order o = new Order();
        Laptop.setQuantity(100);
        Accessories.setQuantity(210);
        ArrayList<Laptop> lp = o.orderLaptop(5);
        ArrayList<Accessories> acc = o.orderAccessories(10);
        System.out.println("laptop remains: "+Laptop.getQuantity());;
        System.out.println(Accessories.getQuantity());
        System.out.println("laptop 5 id "+lp.get(4).getUid());
        System.out.println("remaining laptop "+Laptop.getQuantity());
    }
}
