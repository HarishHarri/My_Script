package Virtusa;
public class Pattern {
public static void main(String[] args) {
		
	
	int space=4;
	int star=1;
	for (int k = 1; k <=3; k++) {
		
	
	for (int i = 1; i<=space; i++) {
		System.out.print(" ");
	}
	for (int j = 1; j<=star; j++) {
		if(j%2==1)
		{
			System.out.print(j);
		}else{
			System.out.print(" ");
		}
	}
	space--;
	star=star+2;
	System.out.println();
	}
	
	
}
}
