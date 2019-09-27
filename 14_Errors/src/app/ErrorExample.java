package app;

public class ErrorExample {
//	public static void error(){
//		int x = 2;
//		while(true) {
//			x = (int) Math.pow(x, 10);
//			System.out.println(x);
//		}
//	}
	
	public static void error1() {
		try {
			for (int i = 0; i < 1; i++) {
				int[] arr = new int[999999999];
			}
		} catch (Error e) {
			System.out.println("auf wiedersehen");
//			System.exit(-1);
		}finally {
			System.out.println("finally . . . .");
		}

	}
	
	public static void main(String[] args) {
		error1();
	}

}
