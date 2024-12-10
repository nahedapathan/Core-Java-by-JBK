package multithreading.practise;

public class Test08 {

	public static void main(String[] args) {
		System.out.println("MainStart ");
		Test08Thread mt1 =new Test08Thread();
		Test08Thread mt2 =new Test08Thread("child2");
		
		System.out.println("mt1 name :"+mt1.getName());
		System.out.println("mt1 name :"+mt1.getPriority());
		System.out.println("mt2 name :"+mt2.getName());
		System.out.println("mt2 name :"+mt2.getPriority());
		
		mt1.setName("child1");
		mt1.setPriority(6);
		mt2.setPriority(9);
		
		System.out.println("\nmt1 name :"+mt1.getName());
		System.out.println("mt1 name :"+mt1.getPriority());
		System.out.println("mt2 name :"+mt2.getName());
		System.out.println("mt2 name :"+mt2.getPriority());
		mt1.start();
		mt2.start();
	}
}
