
public class arr_split {
	public static void main(String[] args) {
		String s1=".... much so U LOVE I know U ";
		String [] hari=s1.split(" ");
		for (int i = hari.length-1; i>=0 ; i--) {
			System.out.print(hari[i]+" ");
		}
	}
}
