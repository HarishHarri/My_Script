
public class Replace {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			
			int  temp1=arr[0+1];
			arr[0+1]=arr[arr.length-2];
			arr[arr.length-2]=temp1;
		}	
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			
		
		
	}

}
