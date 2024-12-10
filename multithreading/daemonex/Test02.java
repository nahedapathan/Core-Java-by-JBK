package multithreading.daemonex;

public class Test02 extends Thread{

	@Override
	public void run() {
		System.out.println("Run Start");
		for(int i=0;i<5;i++)
		{
			System.out.println("run :"+i);
			
		}
		System.out.println("run end");
	}
}
