package Virtusa;

import java.util.Scanner;

public class Reverse_str6 {
	static void rev(String str)
	{
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);	
		}
		if (rev.equals(str)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String a=sc.next();
	rev(a);
}
}
