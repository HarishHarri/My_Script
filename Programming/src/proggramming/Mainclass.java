package proggramming;
class Singleton{
	static int count=0;
	int x=22;
	static Singleton x1;
	private Singleton()
	{
		count++;
	}
	public static  Singleton get()
	{
		if (count<1) {
			
			x1= new Singleton();
		}	
		return x1;	
		}
	public static  void set (int y)
	{
		x1.x=y;
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Singleton s1= Singleton.get();
		System.out.println(s1.x);
		Singleton.set(55);
		System.out.println(s1.x);
		
		
	}
}
