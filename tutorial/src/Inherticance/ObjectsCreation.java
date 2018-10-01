package Inherticance;

public class ObjectsCreation {
	public static void main(String[] args) {
		Admin admin = new Admin("ahamed", "abbas", "ahamed", "ahamed", "x89201");
		admin.eat();
		System.out.println(admin.getUniqueCode());
	}
}
