package multithreading.daemonex;

import multithreading.synchronizedkeyword.MyThread;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyThread mt=new MyThread();
		
		mt.setDaemon(true);
		mt.start();
		System.out.println("main End");
	}
}
