package Abstration;




abstract class vehicle{
	abstract void run();
}

class honda extends vehicle{
	
	void run() {
		System.out.println("running safely");
	}
	
}
public class TestAbstractClass {

	public static void main(String[] args) {
		vehicle h=new honda();
		h.run();

	}

}
