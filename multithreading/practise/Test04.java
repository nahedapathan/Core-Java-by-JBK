package multithreading.practise;

class MyThread2 extends Thread
{
	@Override
	public void run() {
		for(int i=20;i>=1;i--)
		{
			System.out.println("run :"+i);
		}
	}
}

public class Test04 {

	public static void main(String[] args) {
		MyThread2 mt =new MyThread2();
		mt.start();
		
		for(int i=1;i<=20;i++)
		{
			System.out.println("main :"+i);
		}
	}
}
