package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Savali");
		al.add("Sayli");
		al.add("vinay");
		al.add("Sayli");
		System.out.println(al);
		Iterator itr= al.iterator();
		//for(String name:al)
			//System.out.println(name);
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
	System.out.println("Return name:"+al.get(1));
	al.set(1,"sanjana");
	for(String name:al);
	System.out.println(al);
	

	}

}
