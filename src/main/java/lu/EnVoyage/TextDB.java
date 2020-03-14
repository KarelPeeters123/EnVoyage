package lu.EnVoyage;

import java.util.HashMap;
import java.util.Map;

public class TextDB {
	private Map<String, String> db;
	public TextDB() {
		db = new HashMap<>();
	}
	public void addText(String key, String text) {
		db.put(key, text);
	}
	public String getText(String key) {
		return db.get(key);
	}
	public Map<String, String> getMap() {
		return db;
	}
}
