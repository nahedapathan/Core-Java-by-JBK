package multithreading.practise;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("run");
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
		System.out.println();
	}

}
