package Abstraction.Interface;
interface Bottle
{
	void type();
}
class Plastic implements Bottle
{
	public void type()
	{
		System.out.println("Drinkking water in  Plastic bottle.....");
	}
}
class Steel implements Bottle
{
	public void type()
	{
		System.out.println("Drinkking water in  Steel bottle.....");
	}
}
class Glass implements Bottle
{
	public void type()
	{
		System.out.println("Drinkking water in  Glass bottle.....");
	}
}
class Stimulator
{
	static void water(Bottle b1)
	{
		b1.type();
	}
}
public class Mainclass4 {
	public static void main(String[]args)
	{
		Plastic p1=new Plastic();
		Steel s1=new Steel();
		Glass g1=new Glass();
		Stimulator.water(p1);
		Stimulator.water(s1);
		Stimulator.water(g1);
	}

}
