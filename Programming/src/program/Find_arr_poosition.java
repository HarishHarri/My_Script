package program;

public class Find_arr_poosition {
public static void main(String[] args) {
	int []me={5,10,2,10,8};
	int pos=2;
	for(int i=0; i<me.length; i++)
	{
		if(i==(pos-1))
		{
			System.out.println(me[i]);
		}
	}
}
}
