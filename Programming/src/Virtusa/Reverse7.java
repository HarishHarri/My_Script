package Virtusa;

import java.util.Scanner;

public class Reverse7 {
	
	
public static void main(String[] args) {
	Scanner name = new Scanner(System.in);
	System.out.println("enter the string ");
	String a=name.nextLine();
	String[] b=a.split(" ");
	for (int i = b.length-1; i >=0; i--) {
		System.out.print((b[i])+" ");
		
		
	}
	
}
/*static String rev(String b )
{
	
	String rev="";
	for (int i = b.length()-1; i>=0; i--) {
		rev=rev+b.charAt(i);
	}
	return rev;
	}*/
}
