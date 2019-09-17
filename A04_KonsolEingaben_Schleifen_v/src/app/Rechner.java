package app;

public class Rechner {

	public static double rechner(double a, double b, char operator) {
		double result = Double.NaN;
		
		switch (operator) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			if (b == 0) {
				return Double.NEGATIVE_INFINITY;
			}else {
				result = a/b;
			}
			break;
		default:
			System.out.println("Kein gultig Operator");
		}
		return result;
	}
	
}
