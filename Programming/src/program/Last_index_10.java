package program;

public class Last_index_10 {
public static void main(String[] args) {
	int []me={5,10,2,10,8};
	int find=10;
	for(int  i=me.length-1; i>=0; i--)
	{
		if(me[i]==find)
		{
			System.out.println(i+"  is present");
			break;
		}
	}
}
}
