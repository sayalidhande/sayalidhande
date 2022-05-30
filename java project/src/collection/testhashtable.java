package collection;

import java.util.Hashtable;
import java.util.Map;

public class testhashtable {

	public static void main(String[] args) {

		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "ravi");
		ht.put(102, "rani");
		ht.put(103, "rakhi");
		for(Map.Entry m:ht.entrySet())
			System.out.println(m.getKey()+"  "+m.getValue());
		

	}

}
