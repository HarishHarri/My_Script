package program;
abstract  class Disp4
{
	abstract  void test ();
	abstract   void disp();
}
class Hello  extends Disp4
{
	void test()
	{
		System.out.println("Hey");
	}
	void disp ()
	{
		System.out.println("Hi");
	}
}
public class Demo {
public static void main(String[] args) {
	Hello s1=new Hello();
	s1.disp();
	s1.test();
}
}
