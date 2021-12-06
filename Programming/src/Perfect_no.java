
public class Perfect_no {

	public static void main(String[] args) {
		int no=28;
		int sum=0;
		for (int i = 1; i <= no/2; i++) 
		{
			
			if (no%i==0) {
				sum=sum+i;
			}
		}
		if (sum==no) {
			System.out.println(no+" is a perfect no");
		}else{
			System.out.println(no+" not a perfect no");
		}
	}

}
