package Material;
import Stock.Inventory;

public class Laptop extends Inventory{
    private String uid;
    static int count;
    public Laptop(){
        super(3);
        count++;
        setQuantity(getQuantity()+1);
        uid="LAP"+count;
    }
    public String getUid(){
        return uid;
    }
}



// where should i have the quant var, if it is in parent class then how can it have the count of child
