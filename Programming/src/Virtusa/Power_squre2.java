package Virtusa;
public class Power_squre2 {
	static void power(int base, int exponent,int no)  
	{  
	int power = 1;  
	for (int i = 1; i <= exponent; i++){   
	power = power * base;    
	}
	System.out.println(power%no);
	}
	
	
	
public static void main(String[] args) {
	  power(2,10,1025);
	  
}
}
