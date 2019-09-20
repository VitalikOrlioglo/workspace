package rechner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Rechner {
	public String rechne(String expression) {
		String result = "";
		long start=System.currentTimeMillis();
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			result = String.valueOf(engine.eval(expression));
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		System.out.println("Zeit " + (System.currentTimeMillis()-start) +" Millisek");
		return result;
	}
	public static void main(String[] args) {
		Rechner rechner=new Rechner();
		System.out.println(rechner.rechne("12+5*3"));
	}
}
