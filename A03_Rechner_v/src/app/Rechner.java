package app;

public class Rechner {
	
	/**
	 * FIXME
	 * @param a - eine Zahl
	 * @param b - eine Zahl
	 * @param operator - einer gultiger Operator (+, -, *, /)
	 * @return Ergebnis der Berechnung
	 * Was pasiert wenn durch 0 geteilt wird?
	 * -> wie konnen wir darauf reagieren?
	 * 
	 * Welche Parameter kann man noch prufen? Wie? Wo?
	 */
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
	
//	public static boolean isValidOperator(char operator) {
//		boolean result = false;
//		switch (operator) {
//		case '+':
//		case '-':
//		case '*':
//		case '/':
//			result = true;
//			break;
//		default:
//			result = false;
//			break;
//		}
//		return result;
//	}
	
	public static boolean isValidOperator(char operator) {
//		if (operator == '+'|| operator == '-' || operator == '*'|| operator == '/') {
//			return true;
//		}
//		return false;
		return operator == '+'|| operator == '-' || operator == '*'|| operator == '/';
	}
	
	
}
