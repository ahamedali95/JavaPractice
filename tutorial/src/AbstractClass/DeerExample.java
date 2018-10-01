package AbstractClass;

public class DeerExample {
	public static void main(String[] args) {
		Animal obj = new Deer("deer", 10);
		Animal obj2 = new Deer("deer", 10);
		obj.eat();
		obj.sound();
	}
}
