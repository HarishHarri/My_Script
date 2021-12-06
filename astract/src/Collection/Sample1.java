package Collection;
import java.util.ArrayList;
public class Sample1 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add(null);
		System.out.println(l1);
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("A");
		l2.add("B");
		l2.add("C");
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
	}
}
