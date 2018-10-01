package Inherticance;

class Admin extends User {

	private String uniqueCode;
	
	protected Admin(String firstName, String lastName, String userName, String password, String uniqueCode) {
		super(firstName, lastName, userName, password);
		this.setUniqueCode(uniqueCode);
	}
	
	protected void setUniqueCode(String code) {
		this.uniqueCode = code;
	}
	
	protected String getUniqueCode() {
		return this.uniqueCode;
	}

	//method overriding
	@Override
	protected void eat() {
		super.eat();
		System.out.println("Admin is eating");
	}
}

