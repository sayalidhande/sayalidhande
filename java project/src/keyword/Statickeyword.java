package keyword;

public class Statickeyword {
	int id;
	 String name;
	 static String collagename ="HUPM";
	
	 Statickeyword(int i,String n){
		 
		 id=i;
		 name=n;
		 
		 }
	 void display() {
		 System.out.println(id+" "+name+" "+collagename);
	 }



	public static void main(String[] args) {
		Statickeyword s1=new Statickeyword(111,"kiran");
		Statickeyword s2=new Statickeyword(112,"karan");

		s1.display();
		s2.display();

	}

}