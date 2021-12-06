package proggramming;

import java.util.Scanner;

public class AEandO {

	public static void main(String[] args) {
		 
		int even =0;
		int odd=0;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter  the size of array");
		 int size=sc.nextInt();
		 System.out.println("Enter the elements of array");
		 int hari[]=new int[size];
		 for (int i = 0; i <size; i++) {
			hari[i]=sc.nextInt();
		 }
		 for (int j = 0; j < hari.length; j++) {
			
	
		 
		 if (hari[j]%2==0) {
			
			 even=even+hari[j];
			 
		} else {
			
			odd=odd+hari[j];
			
	}
		 }
		 System.out.println(even);
		 System.out.println(odd);
}

}
	
