package program;

import java.util.Scanner;

public class Rev_ {
	  
	public static  void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(hello(sc.next()));
	}
		 static int hello(String ma){
			
			String rev="";
			for (int i = ma.length()-1; i>=0 ; i--) {
				rev=rev+ma.charAt(i);
			}
			if (ma.equals(rev)) {
				return 0;
			}else{
				return 1;
			}
		 }
}

