package Interface1;

public class Lion implements Animal {
	private String name;
	private int age;
	
	
	//An interface may not specify a constructor, 
	//the constructor gets specified in the class that implements the interface.
	protected Lion(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setName(String name) {
		this.name = name;		
	}

	@Override
	public void sound() {
		System.out.println("Voor Voor!");
	}

	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}

}