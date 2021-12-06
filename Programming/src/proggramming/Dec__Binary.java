package proggramming;

import java.util.ArrayList;


public class Dec__Binary {

	public static void main(String[] args) {
		int no=11;
		ArrayList s1 = new ArrayList();
		while (no!=0) {
			s1.add(no%2);
			no=no/2;
		}
		for (int j = s1.size()-1; j >=0; j--) {
			System.out.print(s1.get(j));
		}
	}
}
