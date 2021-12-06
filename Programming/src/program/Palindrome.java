package program;

public class Palindrome {
public static void main(String[] args) {
	int no=143;
	int rev=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	if(rev==copy){
		System.out.println(" The no is Palindrome  "+copy);
	}else{
		System.out.println("The no is not a Palindrome "+rev);
	}
} 
}
