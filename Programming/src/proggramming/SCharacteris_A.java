package proggramming;

 class SCharacteris_A {

	public static void main(String[] args) {
		String S1="ja132@bc@#";
		String a="";
		String b="";
		String c="";
		char [] arr=S1.toCharArray();
		for (int i = 0; i < arr.length; i++)
		{
			if (Character.isAlphabetic(S1.charAt(i))) {
				a=a+S1.charAt(i);
			}else if (Character.isDigit(S1.charAt(i))) {
				b=b+S1.charAt(i);
			}else {
				c=c+S1.charAt(i);
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
