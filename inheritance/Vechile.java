package inheritance;

/**
 * Vechile
 */
public class Vechile {
    String color, model;
    int noOfWheel;
    
    public Vechile(String color, String model, int noOfWheel) {
        this.color = color;
        this.model = model;
        this.noOfWheel = noOfWheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void start(){
        System.out.println("I am starting");
    }

    @Override
    public String toString() {
        return "Vechile [color=" + color + ", model=" + model + ", noOfWheel=" + noOfWheel + "]";
    }
}