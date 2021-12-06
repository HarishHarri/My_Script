package proggramming;

public class Reverse_String_Recuursion {
	static  String rev="";
	static String reverse(String s1){
		int no=s1.length()-1;
		if (no>=0)
		{
			rev=rev+s1.charAt(no);
			reverse(s1.substring(0,no--));
		}
		return rev;
	}
	public static void main(String[] args) {
 
		System.out.print(reverse("Java"));
	}

}
