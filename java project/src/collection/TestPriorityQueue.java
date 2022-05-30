package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> Q = new PriorityQueue<String>();

		Q.add("Sayali");
		Q.add("shravani");
		Q.add("snehal");
		
		System.out.println("Head:" + Q.element());
		System.out.println("Head:" + Q.peek());
		System.out.println("Iterating the Data");
		
		Iterator<String> I = Q.iterator();
		
		while (I.hasNext()) {

			System.out.println(I.next());
			}
		Q.remove();
		Q.poll();
		
		System.out.println("After removing Elements");

		Iterator<String> I1 = Q.iterator();
		while (I1.hasNext()) {
			System.out.println(I1.next());
		}

	}

}
