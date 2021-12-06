package proggramming;

public class SCharacter {

	public static void main(String[] args) {
		String S1="ja132@bc@#";
		String a="";
		String b="";
		String c="";
		char [] arr=S1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=97 && arr[i] <=112) {
				
				a=a+S1.charAt(i);
			}	
			else if (i>=0 && i <=9 )
			{
				b=b+S1.charAt(i);
			
//				}else {
//					c=c+S1.charAt(i);

				}
			
			}
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		}
	}

