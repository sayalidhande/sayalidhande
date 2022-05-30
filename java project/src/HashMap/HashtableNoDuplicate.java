package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashtableNoDuplicate {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "ravi");
		hm.put(2, "rani");
		hm.put(3, "rakhi");
		hm.put(1, "rashi");
		
		System.out.println("Iterating Hashmap");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
	}
	}

}
