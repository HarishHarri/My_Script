import java.util.Scanner;

public class Rev_arry
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in)	;
//		int no=sc.nextInt();
//		int swap=sc.nextInt();
		String ha=sc.next();
		char[] arr=ha.toCharArray();
		for (int i =0; i<3; i++)
		{
			char temp=arr[0]; 
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		
		}
		System.out.println(arr);
	}
}
