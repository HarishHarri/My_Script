package proggramming;

public class PWS1 {

	public static void main(String[] args) {
		int sum=0;
		int [] arr={528, 258, 818, 751};
		for (int no = 0; no < arr.length; no++) {
			if (arr[no]!=0) {
				
				int rem= no%10;
				sum=sum+rem;
				
			}
			System.out.println(sum);
			break;
		}
		
	}

}
