package tutorial;

public class InstanceVariable {
	String myInstanceVar = "Instance variable";
	
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new  InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		obj1.myInstanceVar = "Changed text";
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}
}
