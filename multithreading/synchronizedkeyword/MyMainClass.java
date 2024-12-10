package multithreading.synchronizedkeyword;

public class MyMainClass {

	public static void main(String[] args) {
		MyThread mt1= new MyThread();
		MyThread2 mt2=new MyThread2();
		MyThread3 mt3=new MyThread3();
		
		mt1.setName("Thread-1");
		mt2.setName("Thread-2");
		mt3.setName("Thread-3");
		
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
