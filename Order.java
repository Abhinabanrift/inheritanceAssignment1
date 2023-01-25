import java.util.ArrayList;

import Material.Accessories;
import Material.Laptop;

public class Order {
    public ArrayList<Laptop> orderLaptop(int n){
        ArrayList<Laptop> laps = new ArrayList<>();
        if(n<Laptop.getLowOrderLevelQuantity()){
            System.out.println("RequestForMaterial (RFM)");
        }else if(n<=Laptop.getQuantity()){
            for(int i=0;i<n;i++) laps.add(new Laptop());
            Laptop.setQuantity(Laptop.getQuantity()-n);
        }else{
            System.out.println("not enough lap present");
        }
        return laps;
    }
    public ArrayList<Accessories> orderAccessories(int n){
        ArrayList<Accessories> acc = new ArrayList<>();
        if(n<Accessories.getLowOrderLevelQuantity()){
            System.out.println("RequestForMaterial (RFM)");
        }else if(n<=Accessories.getQuantity()){
            for(int i=0;i<n;i++) acc.add(new Accessories());
            Accessories.setQuantity(Accessories.getQuantity()-n);
        }else{
            System.out.println("not enough acc present");
        }
        return acc;
    }
}
