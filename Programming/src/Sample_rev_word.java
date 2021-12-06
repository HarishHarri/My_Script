import java.util.Scanner;

public class Sample_rev_word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String [] hari =s1.split(" ");
		
		//
		/*for (int i = hari.length-1; i>=0 ; i--) {
			System.out.print(hari[i]+" ");
			if (i==0) {
				System.out.println();
			}			

		}
		
		//
		for (int i = hari.length-1; i>=0 ; i--) {
			System.out.print(rev(hari[i])+" ");
			if (i==0) {
				System.out.println();
			}			

		}*/
		for (int i = 0; i<hari.length ; i++) {
//			if (i==2)
//				{
					
					if (i==2) {
						System.out.print(rev(hari[i])+" ");
					}else {
						System.out.print(hari[i]+" ");
					}
				
//				}else{
//					System.out.print(hari[i]+" ");
//				}
			}
			System.out.println();
		//
	/*	for (int i = 0; i < hari.length; i++) {
		if (i%2==0)
			{
				System.out.print(rev(hari[i])+" "+hari[i].length()+" ");
			}if (condition) {
				
			
			}else{
				System.out.print(hari[i]+" "+hari[i].length()+" ");
			}
		}*/
		
	}
static String rev (String s1)
{
	String rev="";
	for (int i = s1.length()-1; i>=0; i--) {
		rev=rev+s1.charAt(i);
	}
	
	
	return rev;
}
	
}
