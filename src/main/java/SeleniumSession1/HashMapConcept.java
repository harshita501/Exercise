package SeleniumSession1;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("name", "harshita");
		m1.put("class", 10);
		m1.put("gender", 'f');
				
		System.out.println(m1.get("name"));
	}

}
