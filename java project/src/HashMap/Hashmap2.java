package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "ravi");
		hm.put(102, "rani");
		hm.put(103, "rakhi");
		System.out.println("after invoking put()method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
	}

		hm.putIfAbsent(104, "Rashi");
		System.out.println("after invoking putIfAbsent");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
	}
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(105, "sheetal");
		map.putAll(hm);
		System.out.println("After invoking put All()method");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
	}
		
	}

}
