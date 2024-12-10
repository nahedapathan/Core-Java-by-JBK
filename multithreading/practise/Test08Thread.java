package multithreading.practise;

public class Test08Thread extends Thread{

	Test08Thread()
	{
		super();
	}
	
	Test08Thread(String name)
	{
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(getName()+"run"+i);
		}
	}
	

}
