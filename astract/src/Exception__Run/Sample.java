package Exception__Run;

public class Sample {
	public static void main(String[] args) {
	try {
		int i=1/0;
	}
	catch(ArithmeticException e){
		System.out.println("handled.....");
	}
	finally {
		System.out.println("i am finally");
	}
			}
	}

