package inheritance;

public class Bus extends Vechile{
    public Bus(String color, String model, int noOfWheel){
        super(color, model, noOfWheel);
    }
    public void busStop() {
        System.out.println("Bus is at bus sttop");
    }
}
