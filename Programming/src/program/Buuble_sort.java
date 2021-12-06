package program;


public class Buuble_sort {
	public static void main(String[] args) {
	
		int []hari={10,20,2,55,4,48};
		for(int i1=0; i1<hari.length; i1++)
		{
			for(int h=1; h<hari.length; h++)
			{
				if(hari[h-1]<hari[h])
				{
					int hot=hari[h-1];
					hari[h-1]=hari[h];
					hari[h]=hot;
				}
			}
		}
		for(int i1=0; i1<hari.length; i1++)
		{
			System.out.print(hari[i1]+" ");
		}
	}
}
		