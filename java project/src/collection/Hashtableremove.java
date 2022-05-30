package collection;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "ravi");
		ht.put(102, "rani");
		ht.put(103, "rakhi");
		
			System.out.println("before remove:"+ht);
		ht.remove(101);
		System.out.println("after remove:"+ht);
	}

}
