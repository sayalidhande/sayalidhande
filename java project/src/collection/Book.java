package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Book {
	
	int id;
	String name, author, publisher;
	int quantity;
	Book(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}


	public static void main(String[] args) {
	ArrayList<Book> list=new ArrayList<Book>();
	Book b1=new Book(101,"core java","ABC","James Gosling",5);
	Book b2=new Book(102,"advanced java","ABC","James Gosling",10);
	
	list.add(b1);
	list.add(b2);
	//For reverse list
	//Collections.reverse(list);
	
	for(Book b:list) {
		System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.publisher+" "+b.quantity);
	

	}

	}
}
