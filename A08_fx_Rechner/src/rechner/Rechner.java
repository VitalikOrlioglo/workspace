package rechner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import exception.BadExpressionException;

public class Rechner {
	/*
	 * 12+5*3
	 * JavaScript einbinden
	 */
	/**
	 * 
	 * @param expression z.B. 3+5*3
	 * @return
	 * @throws BadExpressionException
	 */
	public static String rechne(String expression) throws BadExpressionException {
		String result = "";
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			result = String.valueOf(engine.eval(expression));
		} catch (ScriptException e) {
			System.out.println("Fehler . . ."+e.getMessage());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			throw new BadExpressionException(e.getMessage());
		}
		return result;
	}

	
	
	
	
	
	public static void main(String[] args) {
		try {
			Rechner rechner = new Rechner();
			System.out.println(rechner.rechne("3+2*2"));
		} catch (BadExpressionException e) {
			e.printStackTrace();
		}
	}
}
