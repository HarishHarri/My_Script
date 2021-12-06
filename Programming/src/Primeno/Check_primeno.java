package Primeno;

public class Check_primeno {
public static void main(String[] args) {
	
	int no=5;
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
	}else{
		System.out.println("Not a prime no  "+no);
	}
}
}

