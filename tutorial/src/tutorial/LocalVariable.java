package tutorial;

public class LocalVariable {
	public String myVar = "Instance variable";
	
	public void myMethod() {
		String myVar = "Inside Method";
		System.out.println(myVar);
	}
	
	public static void main(String[] args) {
		LocalVariable obj1 = new LocalVariable();
		System.out.println(obj1.myVar);
		obj1.myMethod();
	}
}
