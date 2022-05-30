package keyword;


class Animal{
	Animal(){
		System.out.println("animal is creaed");
		
	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Dog is created");
	}
}

public class Superkeyword {
	
public static void main(String[] args) {
	Dog d = new Dog();

	}

}
