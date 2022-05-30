
public class IIBBike {
	
	
	
	int speed;
	
	
	
	
	IIBBike()
	{
		System.out.println("constructor is invoked");
	}
	void show() {
		System.out.println("mtd is invoked");
	}
	
	{System.out.println("instance initializer block is invoked");}
	
	public static void main(String[] args) {
		IIBBike b=new IIBBike();
		b.show();

	}

}
