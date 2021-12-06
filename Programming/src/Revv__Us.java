import java.util.Scanner;

public class Revv__Us {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String l1=sc.next();
		String  rev="";
		char [] hari=l1.toCharArray();
		for (int i = hari.length-1; i >=0; i--) {
		rev = rev+l1.charAt(i);
		}
		System.out.println(rev);
		
	}

}
