package Virtusa;

import java.util.Scanner;

public class Hello_word_count9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a=sc.nextLine();
	String[] b=a.split(" ");
	add(rev(a),b);
		
}
static String rev(String a)
{
	String rev="";
	for (int i = a.length()-1; i>0; i--) {
		rev=rev+a.charAt(i);
	}
	return rev;
	}

 static void add(String a, String[] b) {
	for (int i = 0; i < b.length; i++) {
		if(a.equals(rev(b[i])))
		{
			System.out.println("0");
		}else 
		{
			System.out.println("1");
		}
	}
}
}
