package program;

public class Find_and_count {
public static void main(String[] args) {
	int [] hari ={55,22,22,42,10,5,2};
	int find=22;
	int count=0;
	for (int j=0; j<hari.length; j++){
		if(hari[j]==find){
		count++;
		System.out.println(find+"  "+count);
	}
}
	System.out.println(find+"  "+count);
}
}
