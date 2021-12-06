import java.util.Scanner;

public class Colortoken1 {

	static int b;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	
		 int a=sc.nextInt();
		 int []hari=new int[b];
		for (int i = 0; i <=a; i++) {
			b=sc.nextInt();
			int c=sc.nextInt();
			 for (int j = 0; j < hari.length; j++) {
				 hari[j]=sc.nextInt();
			}
		}
		hello(hari);
		
	}
	static void hello(int arr[])
	{
		for(int i1=0; i1<arr.length; i1++)
		{
					for(int h=1; h<arr.length; h++)
			{
				if(arr[h-1]<arr[h])
				{
					int hot=arr[h-1];
					arr[h-1]=arr[h];
					arr[h]=hot;
				}
			}
		}	
	}
			

}
