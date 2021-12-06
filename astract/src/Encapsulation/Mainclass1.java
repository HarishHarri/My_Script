package Encapsulation;
class Friends
{
	private String name="Hari";

	public String takename() {
		return name;
	}

	public void changename(String name) {
		this.name = name;
	}
	
}

public class Mainclass1 {
	public static void main(String[]args)
	{
		Friends f1=new Friends();
		System.out.println(f1.takename());
		f1.changename("HIJ");
		System.out.println(f1.takename());
	}
}
