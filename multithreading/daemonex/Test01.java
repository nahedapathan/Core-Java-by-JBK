package multithreading.daemonex;

public class Test01 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"Good Evening All");
		}
	}
}
