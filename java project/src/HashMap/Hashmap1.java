package HashMap;

import java.util.HashMap;
import java.util.Map;


public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "ravi");
		hm.put(102, "rani");
		hm.put(103, "rakhi");
		System.out.println("Iterating HashMap");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
	}

}
}
