package AbstractClass;

public class Animal {
	private String name;
	private int age;
	
	protected Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	private void setAge(int age) {
		this.age = age;
	}
	
	protected String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	protected int getAge() {
		return this.age;
	}
}
