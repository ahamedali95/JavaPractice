package tutorial;

public class ClassVariable {
	public static String myClassVar = "class variable or static variable";
	
	public static void main(String[] args) {
		System.out.println(ClassVariable.myClassVar);
		
		ClassVariable obj1 = new ClassVariable();
		ClassVariable obj2 = new ClassVariable();
		ClassVariable obj3 = new ClassVariable();
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		obj1.myClassVar = "Changed text";
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}