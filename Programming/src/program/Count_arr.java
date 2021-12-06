package program;

public class Count_arr {
public static void main(String[] args) {
	int []me={5,10,2,10,8};
	int count=0;
	int find=10;
	for(int i=0; i<me.length; i++)
	{
		if(me[i]==find)
		{
			count++;
		}
	}
	System.out.println(find+"  is present and count is "+count );
}
}
