package Abstration;


abstract class shape{
	abstract void draw();
}
class circle extends shape{
	void draw() {
		System.out.println("circle drawing");
	}
}
class rectangle extends shape{
	void draw() {
		System.out.println("rectangle drawing");
	}
}
public class TestaAbstraction1 {
	

	public static void main(String[] args) {
		shape s=new circle();
		s.draw();

	}

}
