package Interface1;

public interface Animal {
	String name = "animal";
	//We cannot have instance variables, rather we can have a constant 
	//static final variable
	//Any methods we declare are abstract, final and public
	//An interface may not specify a constructor, 
	//the constructor gets specified in the class that implements the interface.
	void sound();
	void eat();
}
