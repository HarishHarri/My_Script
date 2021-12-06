
public class Find_smallest {
	public static void main(String[] args) {
		
	
	int [] arr={12,13,14,15,2};
	int i=0;
	int small=arr[i];
	for (int no : arr) {
		if (no<small) {
			small=no;
		}
	}
	System.out.println(small);
}
}