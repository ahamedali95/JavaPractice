package Overloading;

public class Animal {
	private void sayMyName(String name) {
		System.out.println("My name is " + name);
	}
	
	private void sayMyName() {
		System.out.println("my name is Deer");
	}

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.sayMyName("Deer");
	}

}
