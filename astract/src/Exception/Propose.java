package Exception;

public class Propose
{
	static void love() throws ProposeException
	{
		int Sowmya=143;
		String Shreyas="No";
		if(Sowmya==143& Shreyas=="yes")
		{
			System.out.println("Committed");
		}else{
			throw new ProposeException("Prema Geema Jaane dho....");
		}
	}
	public static void main(String[] args) 
	{
		try {
			love();
		} catch (ProposeException s)
		{
			
			System.out.println(s.getMessage()); 
		}
	}
}
class ProposeException extends Exception
{
	String msg;
	ProposeException(String msg){
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}
