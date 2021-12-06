package Virtusa;

public class Smallest_largest3 {
	static void add(char[] arr)
	{
		int min=arr[0];  
	    int max=arr[0];
	    for (int i = 0; i < arr.length; i++) {  
	          if(arr[i]<min)  
	           min = arr[i];  
	          if(arr[i]>max)
	          {
	        	  max=arr[i];
	          }
	    }  
	    System.out.println(min+max);  
	} 
	
public static void main(String[] args) 
{
	//char[] arr={'a', 'A', 'K', 'l', 'i','P'};
	String a="ARHOz";
	char[] arr=a.toCharArray();
	add(arr);
	}
}