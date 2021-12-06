package program;

public class Febenacci {
	public static void main(String[] args) {
		int Fib1=0;
		int Fib2=1;
		int Fib3;
		System.out.println(Fib1);
		for(int i=1; i<=10; i++)
		{
			Fib3=Fib1+Fib2;
			System.out.println(Fib3);
			Fib1=Fib2;
			Fib2=Fib3;
		}
	}
}
