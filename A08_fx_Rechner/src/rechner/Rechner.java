package rechner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Rechner {
	/*
	 * 12+5*3
	 * JavaScript einbinden
	 */
	public static String rechne(String expression) {
		String result = "";
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			result = String.valueOf(engine.eval(expression));
		} catch (ScriptException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		Rechner rechner = new Rechner();
		System.out.println(rechner.rechne("3+2*2"));
	}
}
