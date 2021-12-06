package Multi_thread;

class Demo implements Runnable
{
		public void run() {
			for (int i = 100; i <=110; i++) {
				System.out.println(i);
				
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
			}
		}
		}
	}
class Sample extends Thread
{
	public void run(){
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}

public class Mainclass {

	public static void main (String[] args)
	{
		Sample  s1=new Sample();
		Thread th1=new Thread(s1);
		th1.start();
		
		Demo d1=new Demo();
		Thread th2=new Thread(d1);
		th2.start();
		
	}
}




