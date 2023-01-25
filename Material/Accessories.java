package Material;

import Stock.Inventory;

public class Accessories extends Inventory{
    String uid;
    static int count;
    public Accessories(){
        super(5);
        setQuantity(getQuantity()+1);
        count++;
        uid="ACC"+count;
    }
    public String getUid(){
        return this.uid;
    }
}
