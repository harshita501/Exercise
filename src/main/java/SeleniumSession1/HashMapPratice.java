package SeleniumSession1;

import java.util.HashMap;
import java.util.Map;

public class HashMapPratice {
	public static void main(String[] args) {
		Map<String,String> empMap = new HashMap<String, String>();
		empMap.put("name", "Tom");
		empMap.put("id", "101");
		empMap.put("city", "banglore");
		empMap.put("country", "india");
		empMap.put("age", "30");
		empMap.put("gender", "male");
		empMap.put(null, "50");
//		empMap.put("null", "60");
		empMap.put("address", null);
		empMap.put("salary", null);
		
		System.out.println(empMap.get("city"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("address"));
		System.out.println(empMap.get("salary"));
		
//		to fetch all key values: entrySet
		
		for(Map.Entry<String, String> entry : empMap.entrySet()) {
			System.out.println("key = "+ entry.getKey() + " value = "+entry.getValue());
		}
		
		
	}
	
	
	

}
