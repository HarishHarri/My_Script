package collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_HMER {

	public static void main(String[] args) {
		Map<String, Integer> a1=new TreeMap<String,Integer>();
		String [] hari={"Hari","Suri","Mari","Hari","Suri","Suri"};
		for (String h : hari) {
			if (!a1.containsKey(h)) {
				
				a1.put(h, 1);
				
			} else {
				
				int count=a1.get(h);
				a1.put(h, count+1);
				
			}
		}
		int Largest=0;
		String s=null;
			for (Entry<String, Integer> l1 : a1.entrySet()) {
				if (l1.getValue()>Largest) {
					
					Largest=l1.getValue();
					s=l1.getKey();
					
				}
//				System.out.println(l1.getKey()+"  "+l1.getValue());
			}
			System.out.println(s+"  "+Largest);
	}}
	
	


