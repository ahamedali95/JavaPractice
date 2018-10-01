package StaticKeyword;

import java.util.ArrayList;

class Person {
	private String name;
	private static ArrayList<Person> people = new ArrayList<Person>();
	
	protected Person(String name) {
		this.setName(name);
		people.add(this);
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected static int noOfPeople() {
		return people.size();
	}
	
	protected static ArrayList<Person> getPeople() {
		return people;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("ahamed");
		Person person2 = new Person("daniel");
	
		//System.out.println(person2.getName());
		System.out.println(noOfPeople());
	}
}