package tutorial;

class CatObject {
	
	private int age;
	private String name;
	private String breed;
	
	CatObject(int age, String name, String breed) {
		this.setAge(age);
		this.setName(name);
		this.setBreed(breed);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}

	protected String getBreed() {
		return this.breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String makeSound() {
		return "meow! meow! meow!";
	}
}
