package app;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> farben = new HashMap<>();
		farben.put("rot", "#ff0000");
		farben.put("grun", "#00ff00");
		farben.put("blau", "#0000ff");
		farben.put("grau", "#555555");
		farben.put("grau", "#777777");
		
		System.out.println(farben);// unsorted
		System.out.println(farben.get("grau"));// #777777
		
		for (String key : farben.keySet()) {
			System.out.println(key + ": " + farben.get(key));
		}
		
		System.out.println(farben.containsKey("grau"));
		
	}

}
