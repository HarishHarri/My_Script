package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map__UniqueElement {
	public static void main(String[] args) {
		Map < Character, Integer> ha=new TreeMap<Character, Integer>();
		int count1=0;
		String s1="aabcd";
		char [] hari=s1.toCharArray();
		for (char ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Character, Integer> o1: ha.entrySet()) {
			if (o1.getValue()==1) {
				count1++;
			}
		}
		System.out.println(count1);
	}
	}
		
		
		
	/*	Map < Integer, Integer> ha=new TreeMap<Integer, Integer>();
		Integer[]hari={50,40,30,20,20};
		for (Integer ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Integer, Integer> o1: ha.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
		*/
		
		
		
		/*Map < Byte, Integer> ha=new TreeMap<Byte, Integer>();
		Byte[]hari={5,4,3,2,2,};
		for (Byte ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Byte, Integer> o1: ha.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
		}*/
		
		
		
		
		/*Map < Short, Integer> ha=new TreeMap<Short, Integer>();
		Short[]hari={15,14,13,12,12,};
		for (Short ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Short, Integer> o1: ha.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
		}*/
		
		
		
		/*Map < Long, Integer> ha=new TreeMap<Long, Integer>();
		Long[]hari={(long) 100, (long) 200, (long) 300, (long) 200, (long) 100};
		for (Long ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Long, Integer> o1: ha.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
		}*/
	
		
		
		/*Map < Double, Integer> ha=new TreeMap<Double, Integer>();
		Double[]hari={20.54d, 52.42d, 20.54d, 64.25d ,13.25d,};
		for (Double ma : hari) {
			if (!ha.containsKey(ma)) {
				ha.put(ma, 1);
				
			} else {
				int count=ha.get(ma);
				ha.put(ma, count+1);
			}
		}
		for (Entry< Double, Integer> o1: ha.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
		}*/
	
