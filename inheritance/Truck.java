package inheritance;

public class Truck extends Vechile {
    Truck(String color, String model, int noOfWheel){
        super(color, model, noOfWheel);
    }
    public void run() {
        System.out.println("truck is running");
    }
}
