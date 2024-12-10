package multithreading.daemonex;

public class Test01Main {

	public static void main(String[] args) {
		Test01 t1=new Test01();
		System.out.println(t1.isDaemon());
		
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		t1.setName("Thread-1");
		t1.setPriority(10);
		t1.start();
		
		
		Test01 t2=new Test01();
		System.out.println(t2.isDaemon());
		t2.setDaemon(true);
		
		t2.setName("Thread-2");
		t2.setPriority(2);
		t2.start();
	}
}
