import java.util.Scanner;

public class hh {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	for (int i = 0; i <=no; i++) {
		sum=sum+(i*i);
	}
	System.out.println(sum);
}
}
