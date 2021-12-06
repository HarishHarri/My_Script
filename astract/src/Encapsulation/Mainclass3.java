package Encapsulation;
class Flipkart
{
	private int password =2468;

	public int takePassword() {
		return password;
	}

	public void changePassword(int password) {
		this.password = password;
	}
	
}
public class Mainclass3 {
	public static void main(String[]args)
	{
		Flipkart f1=new Flipkart();
		System.out.println(f1.takePassword());
		f1.changePassword(9559);
		System.out.println(f1.takePassword());
	}
}
