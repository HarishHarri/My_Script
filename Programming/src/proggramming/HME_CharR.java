package proggramming;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HME_CharR {
	public static void main(String[] args) {
		String s1="Jayanth";
		char []hari=s1.toCharArray();
		Map<Character, Integer> a=new TreeMap<Character, Integer>();
		for (char c : hari) {
			if (!a.containsKey(c)) {
				a.put(c, 1);
				
			} else {
				
				int count=a.get(c);
				a.put(c, count+1);
			}
		}
		for (Entry<Character, Integer> o1 : a.entrySet()) {
			
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}
}
