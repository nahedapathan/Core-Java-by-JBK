package multithreading.synchronizedkeyword;

public class TesT {

	synchronized static void show()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Evening "+Thread.currentThread().getName());
		}
	}
}
