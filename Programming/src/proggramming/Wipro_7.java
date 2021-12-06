package proggramming;

import java.util.Arrays;
import java.util.Scanner;

public class Wipro_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int [] arr=new int[a];
		for (int i = 0; i <a; i++) {
			arr[i]=sc.nextInt();
		
		}
		
	
		int no=sc.nextInt();
		int no1=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (i<no) {
				System.out.print(arr[i]+" ");
			}else if(i>no1){
			System.out.print(arr[i]+" ");
			}else if (i>=no&&i<=no1) {
				int li=Arrays.toString(arr[no1]);
				for (int j = no1; j >=no;) {
					System.out.print(arr[i]+" ");
					break;
				}
			} 
			
				
			
			
			
		}	
		
	}
//	static void rev(int d, int r, int[] arr){
//		for (int i =d ; i>=r; i--) {
//			
//			System.out.println(arr[i]+" ");
//		}
		
		
	}


