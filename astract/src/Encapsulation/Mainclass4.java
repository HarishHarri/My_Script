package Encapsulation;
class Demo
{
	private int a =10;

	public int set_a() {
		return a;
	}

	public void change_a(int a) {
		this.a = a;
	}
	
}
public class Mainclass4 {
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		System.out.println(d1.set_a());
		d1.change_a(40);
		System.out.println(d1.set_a());
	}
}
