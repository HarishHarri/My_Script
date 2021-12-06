package String_class;

public class Sample {
	public static void main(String[] args) {
		String h1="Su.....";
		String S1="Su.....";
		System.out.println(h1==S1);
		 
		String exp_res=new String("Welcome page");
		String act_res=new String("Welcome page");
		
		System.out.println(exp_res==act_res);
		System.out.println(exp_res.equals(act_res));
	}
}
