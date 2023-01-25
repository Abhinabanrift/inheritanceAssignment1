public class TestCalculator {
    public static void main(String[] args) {
        double num1 = 2, num2 = 4;
        String num3 =Calculator.findAverage(num1, num2);
        if(num3.equals(new String("3.00"))) System.out.println("correct "+ num3);
        else System.out.println("error "+ num3);
    }
}
