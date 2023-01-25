package inheritance;


public class Road {
    public static void main(String[] args) {
        Car c = new Car("red", "x1", 4);
        Bus b = new Bus("yellow", "dn8", 8);
        Truck t = new Truck("green", "h4", 12);
        c.stop();
        b.busStop();
        System.out.println(t.toString());
    }
}
