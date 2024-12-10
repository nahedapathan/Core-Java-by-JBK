package multithreading.practise;

class MyRunnable implements Runnable
{
	public void run() {
		System.out.println("Run");
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
		Thread th=new Thread(mr);
		th.start();
		System.out.println("main");
	}
}
