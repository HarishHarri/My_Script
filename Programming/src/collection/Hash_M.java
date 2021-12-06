package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_M {

	public static void main(String[] args) {

		HashMap<String, Integer>a1=new HashMap<>();
		a1.put("Hari", 123);
		a1.put("Suri", 155);
		a1.put("Hari", 123);
		for (Entry<String, Integer> f1 : a1.entrySet()) {
			System.out.println(f1.getKey()+"  "+f1.getValue());
		}
		
	}

}
