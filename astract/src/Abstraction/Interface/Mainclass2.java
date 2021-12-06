package Abstraction.Interface;
interface Sports
{
	void players();
}
class Hockey implements Sports
{
	public void players()
	{
		System.out.println("Hockey Players.....");
	}
}
class Football implements Sports
{
	public void players()
	{
		System.out.println("Football Players.....");
	}
}
class Basketball implements Sports
{
	public void players()
	{
		System.out.println("Basetball Players.....");
	}
}
class Playground
{
	static void team(Sports s1)
	{
		s1.players();
	}
}
public class Mainclass2 
{
	public static void main(String[]args)
	{
		Hockey h1=new Hockey();
		Football f1=new Football();
		Basketball b1=new Basketball();
		Playground.team(h1);
		Playground.team(f1);
		Playground.team(b1);
		
		
	}

}
