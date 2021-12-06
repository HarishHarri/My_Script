package Virtusa;

public class Rev_for_given_input5 {
public static void main(String[] args) {
        int [] arr = new int [] {1,2,3};     
        int n = 2;    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }      
        for(int i = 0; i < n; i++){    
            int j, last;    
            last = arr[arr.length-1];    
            for(j = arr.length-1; j > 0; j--){    
                arr[j] = arr[j-1];    
            }  
            arr[0] = last;    
        }    
        System.out.println();    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
	
	/*int[] a={1,2,3};
	for (int i =a.length-1; i>=0;i--) {
		System.out.println(a[i]);
	}*/
}
