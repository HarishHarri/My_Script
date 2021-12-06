package program;

public class Linear_search_10 {
public static void main(String[] args) {
	int []me={5,10,2,10,8};
	int find=10;
	for(int i=0; i<me.length; i++)
	{
		if(me[i]==find)
		{
			System.out.println(find+"  is present");
			break;
		}
	}
}
}
