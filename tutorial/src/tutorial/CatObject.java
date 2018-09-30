package tutorial;

public class CatObject {
	
	int age;
	String name;
	String breed;
	
	CatObject(int age, String name, String breed) {
		this.age = age;
		this.name = name;
		this.breed = breed;
	}
	
	public String makeSound() {
		return "meow! meow! meow!";
	}

	public static void main(String[] args) {
		CatObject myFirstCat = new CatObject(26, "brie", "puppy");
		System.out.println(myFirstCat.age);
	}
}
