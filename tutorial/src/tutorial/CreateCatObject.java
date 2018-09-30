package tutorial;

public class CreateCatObject {
	public static void main(String[] args) {
		CatObject myFirstCat = new CatObject(26, "brie", "puppy");
		myFirstCat.setAge(50);
		System.out.println(myFirstCat.getBreed());
	}
}
