package proggramming;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HME_Mchar {

	public static void main(String[] args) {
		String []  s1={"Jayanth","Harish"};
		Map<Character, Integer> a=new TreeMap<Character, Integer>();
		for (int i = 0; i < s1.length; i++) {
		char []hari=s1[i].toCharArray();
			for (char c :hari) {
				if (!a.containsKey(c)) {
					a.put(c, 1);
					
				} else {
					
					int count=a.get(c);
					a.put(c, count+1);
				}
			}
		}
		
		for (Entry<Character, Integer> o1 : a.entrySet()) {
			
			System.out.println(o1.getKey()+"  "+o1.getValue());
		}
	}

}
