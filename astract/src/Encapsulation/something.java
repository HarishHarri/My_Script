package Encapsulation;

import java.util.Scanner;


public class something {		
	public static void main (String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Start range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();
		sc.close();
		for(int no=start; no<=end; no++)
		{
		boolean hari=true;
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				hari=false;
				break;
			}
		}
		if(hari==true)
		{
			System.out.println("prime no is  "+no);
		}
	}

}
}
