package Inherticance;

public class Admin extends User {

	private String uniqueCode;
	
	Admin(String firstName, String lastName, String userName, String password, String uniqueCode) {
		super(firstName, lastName, userName, password);
		this.setUniqueCode(uniqueCode);
	}
	
	protected void setUniqueCode(String code) {
		this.uniqueCode = code;
	}
	
	protected String getUniqueCide() {
		return this.uniqueCode;
	}

	//method overriding
	protected void eat() {
		super.eat();
		System.out.println("Admin is eating");
	}
}

