package proggramming;

public class SUpercase {
	public static void main(String[] args) {
		String str1="Xyz";
		String str2=new String ("Xyz");
		System.out.println(str1==str2);
		str2.intern();
		System.out.println(str1==str2);
	}
}

		