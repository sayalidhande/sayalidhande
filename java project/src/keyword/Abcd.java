package keyword;

public class Abcd {
	int id;
	String name;
	String city;
	Abcd(int id, String name, String city){


		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	Abcd(int id, String name){


		this.id=id;
		this.name=name;
		
	}

	void display() {
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String[] args) {
		Abcd s1=new Abcd (111,"kiran","morshi");
		Abcd s2=new Abcd(222,"karan");		
				s1.display();
		s2.display();
		

	}

}
