
public class String_repated {
	public static void main(String[] args) {
		String h1="hihellohhihi";
		int count=0;
		for (int i = 0; i <=h1.length()-2; i++) {
			if (h1.substring(i, i+2).equals("hi")) {
				count++;
			
			}
		}
		System.out.println(count);
	}
}
