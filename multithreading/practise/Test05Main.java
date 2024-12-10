package multithreading.practise;

public class Test05Main {

	public static void main(String[] args) {
		Test05 mt1=new Test05(10);
		mt1.start();
		
		Test05 mt2=new Test05(15);
		mt2.start();
	}
}
