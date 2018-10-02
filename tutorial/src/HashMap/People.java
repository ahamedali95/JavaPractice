package HashMap;

import java.util.HashMap;

public class People {

	public static void main(String[] args) {
		HashMap<String, String> hashMap= new HashMap<String, String>();
		
		//Adding elements to the HashMap
		hashMap.put("name", "ahamed");
		
		System.out.println("value of key `name` is " + hashMap.get("name"));
		
		//Iterate through a HashMap
		hashMap.forEach((key, value) -> {
			System.out.println(key);
		});
		
		//check to see whether a key exists or not 
		System.out.println(hashMap.containsKey("age"));
	}

}
