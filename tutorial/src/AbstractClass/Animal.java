package AbstractClass;

abstract public class Animal {
	private String name;
	private int age;
	
	protected Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	private void setAge(int age) {
		this.age = age;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	protected abstract void sound();
	
	protected void eat() {
		System.out.println("Animal is eating");
	}
}
