package Encapsulation;
class Dinga
{
	private String says="143";

	public String youknow() {
		return says;
	}

	public void felling(String says) {
		this.says = says;
	}
}
public class Mainclass2 {
	public static void main(String[]args)
	{
		Dinga d1=new Dinga();
		System.out.println(d1.youknow());
		d1.felling("I LOVE YOU......");
		System.out.println(d1.youknow());
	}
}
