package Virtusa;

import java.util.Scanner;
public class Smallest_largest_no_add8 {
	static void add(int[] a)
	{
		int c=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<c)
			{
				c=a[i];
			}
		}
		System.out.println(c);
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int[] b=new int[a];
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();		
	}
	add(b);}}
/*int[] a={7,2,6,15,54,10,23};

int b=a[3];
int c=a[3];
for (int i = 0; i < a.length; i++) {
	if(a[i]>b)
	{
		b=a[i];
	}
	if(a[i]<c)
	{
		c=a[i];
	}
}
System.out.println(b+c);*/