package keyword;

public class ABC {
	int id;
	String name;
	String city;
	ABC(int id, String name, String city){


		this.id=id;
		this.name=name;
		this.city=city;

	}

	void display() {
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String args[]) {
		ABC s1=new ABC (111,"kiran","morshi");
		ABC s2=new ABC(222,"karan","pune");
		s1.display();
		s2.display();
		
	
	}
	

}
