package app;

public class Test {
	String name;
	private static int counter;
	public Test(String name) {
		this.name = name;
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Test.counter = counter;
	}
	
}
