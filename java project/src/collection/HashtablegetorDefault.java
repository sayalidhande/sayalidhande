package collection;

import java.util.Hashtable;

public class HashtablegetorDefault {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "ravi");
		ht.put(102, "rani");
		ht.put(103, "rakhi");
		System.out.println(ht.getOrDefault(101, "not found"));
		System.out.println(ht.getOrDefault(104, "not found"));
		
	
	}

}
