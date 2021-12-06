package Abstraction.Interface;
interface BTech
{
	void branch();
}
class Mech implements BTech
{
	public void branch()
	{
		System.out.println("Mechanical Student.....");
	}
}
class Civil implements BTech
{
	public void branch()
	{
		System.out.println("Civil Student.....");
	}
}
class EEE implements BTech
{
	public void branch()
	{
		System.out.println("EEE Student.....");
	}
}
class Management
{
	static void students(BTech b1)
	{
		b1.branch();
	}
}
public class Mainclass5 
{
	public static void main(String[]args)
	{
		Mech m1=new Mech();
		Civil c1=new Civil();
		EEE e1=new EEE();;
		Management.students(m1);
		Management.students(c1);
		Management.students(e1);
	}

}
