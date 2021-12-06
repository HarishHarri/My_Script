package Encapsulation;
class SBI
{
	private String cust_name ="Jayanth";

	public String setname() {
		return cust_name;
	}

	public void changename(String cust_name) {
		this.cust_name = cust_name;
	}
	
}
public class Mainclass5 {
	public static void main(String[]args)
	{
		SBI s1=new SBI();
		System.out.println(s1.setname());
		s1.changename("dj");
		System.out.println(s1.setname());
	}
}

      