
public class Calculator {
	static String findAverage(double a, double b) {
		return  String.format("%.2f", (a+b)/2);
	}
	static String findAverage(double a, double b, double c) {
		return  String.format("%.2f", (a+b+c)/3);
	}
	static String findAverage(double a, double b, double c, double d) {
		return String.format("%.2f", (a+b+c+d)/4);
	}	
}
