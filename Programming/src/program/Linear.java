package program;

public class Linear {
	public static void main(String[] args) {
		int [] arr={20,2,5,10,55};
		int find=10;
		for(int i=0; i<=arr.length;  i++)
		{
			if(arr[i]==find)
			{
				System.out.println("The no is present "+find);
				break;
			}
		}
	}

}
