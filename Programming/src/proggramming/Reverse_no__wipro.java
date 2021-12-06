package proggramming;

import java.util.ArrayList;

public class Reverse_no__wipro {
 public static void main(String[] args) {
	 int no=12403;
		ArrayList<Character> s1 = new ArrayList<Character>();
		while (no!=0) {
			s1.add((char) (no%10+97));
			no=no/10;
		}
		for (int j = s1.size()-1; j >=0; j--) {
			System.out.print(s1.get(j));
		}
}
}
