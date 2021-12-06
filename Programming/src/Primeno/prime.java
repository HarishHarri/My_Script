package Primeno;

public class prime
{
		public static void main(String[] args)
		{
			for(int no=2; no<=100; no++)
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