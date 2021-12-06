package Exception;

public class Swiggy
{
	static void delivery() throws SwiggyException
	{
		double km=5.50;
		int ordercost=50;
		if(km<=4 & ordercost>=400)
		{
			System.out.println("Free Delivery");
		}else{
			throw new SwiggyException("Delivery charge will be applicable");
		}
	}
	public static void main(String[] args) 
	{
		try {
			delivery();
		} catch (SwiggyException s)
		{
			
			System.out.println(s.getMessage()); 
		}
	}
}
class SwiggyException extends Exception
{
	String msg;
	SwiggyException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}
