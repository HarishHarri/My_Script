package Virtusa;
import java.util.Scanner;

class Remove_letter_l_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str=sc.nextLine();
	String a=sc.next();
	add(str,a);
}
static void add(String str,String a)
{
	String strNew = str.replace(a,"");
	System.out.println(strNew);
}

}
