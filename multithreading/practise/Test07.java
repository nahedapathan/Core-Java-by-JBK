package multithreading.practise;



public class Test07 {
	public static void main(String[] args) {
		Test07MyThread mt1=new Test07MyThread();
		Test07MyThread mt2=new Test07MyThread();
		
		
	    mt1.setPriority(10);
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.start();
		mt2.start();
	}
	
}
