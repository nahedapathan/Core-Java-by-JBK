package multithreading.practise;



public class Test01 {
	
		void m1()
		{
			System.out.println("m1");
		}
		void m2()
		{
			System.out.println("m2");
		}
		void m3()
		{
			System.out.println("m3");
		}
	
	
	public static void main(String[] args) {
		Test01 e1=new Test01();
		e1.m1();
		e1.m2();
		e1.m3();
	}

}
