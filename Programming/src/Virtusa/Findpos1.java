package Virtusa;
import java.util.Scanner;
public class Findpos1 {
	static void add(String string,char a2)
	{
		for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i)==a2)
			{
				System.out.println(i+1);
			}
			//doubt how to print(-1);
		}
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String string=sc.nextLine();
	char a=sc.next().charAt(0);
	add(string,a);
	    }
	
}



//look your net logic


/*String string = ("You are awesome honey");
for (int i = 0 ; i<=string.length()-1 ; i++)
if (string.charAt(i) == 'o')
System.out.println(i+1);*/
