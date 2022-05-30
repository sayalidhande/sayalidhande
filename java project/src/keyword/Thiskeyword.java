package keyword;
 public class Thiskeyword{
	 int id;
	 String name;
	 Thiskeyword(){
		 System.out.println("default constructor is invoked");
	 }
 
 
	 Thiskeyword(int id,String name){
	 this();
	 this.id=id;
	 this.name=name;}
 void display() {
	 System.out.println(id+" "+name);
 }



	public static void main(String[] args) {
		Thiskeyword s1=new Thiskeyword(111,"kiran");
		Thiskeyword s2=new Thiskeyword(112,"karan");

		s1.display();
		s2.display();
		

	}

}
