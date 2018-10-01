package AbstractClass;

public class Deer extends Animal {
	protected Deer(String name, int age) {
		super(name, age);
	}
	
	protected void eat() {
		super.eat();
		System.out.println("Deer is eating");
	}

	@Override
	protected void sound() {
		System.out.println("Doo Doo!");
	}
}
