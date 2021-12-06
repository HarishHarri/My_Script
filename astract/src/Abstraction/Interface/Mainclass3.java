package Abstraction.Interface;
interface Groceries
{
	void buying();
}
class Vegitables implements Groceries
{
	public void buying()
	{
		System.out.println("Buying Vegitables.....");
	}
}
class Fruits implements Groceries
{
	public void buying()
	{
		System.out.println("Buying Fruits.....");
	}
}
class Dal implements Groceries
{
	public void buying()
	{
		System.out.println("Basetball Dal.....");
	}
}
class Filpkart
{
	static void order(Groceries g1)
	{
		g1.buying();
	}
}
public class Mainclass3 {
	public static void main(String[]args)
	{
		Vegitables v1=new Vegitables();
		Fruits f1=new Fruits();
		Dal d1=new Dal();
		Filpkart.order(v1);
		Filpkart.order(f1);
		Filpkart.order(d1);
	}

}
