package inheritance;

public class Car extends Vechile {
    Car(String color, String model, int noOfWheel){
        super(color, model, noOfWheel);
    }
    public void stop() {
        System.out.println("car is stopping");
    }
}
