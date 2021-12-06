package program;

public class Strg_no {
	public static void main(String[] args) {	
		for(int h=1; h<=10000; h++){
		int no=h;
		int sum=0;
		int count=0;
		int copy=no;
		while(no!=0)
		{
			int rem =no%10;
			int k=rem;
			int fact=1;
			for(int i=k; i>=1; i--)
			{
				fact=fact*i;
	
			}
			sum=sum+fact;

			no=no/10;
			
		
		}if(sum==copy){
			count++;
	System.out.println("Strong no is "+copy+"  and count is  "+count);	
}}
}	}	
