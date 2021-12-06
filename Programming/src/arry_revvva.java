
public class arry_revvva {
	public static void main(String[] args) {
		String s="Qspiders";
		char[] ch=s.toCharArray();
		int j=ch.length-1;
		for(int i=0; i<j; i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
	}
}
