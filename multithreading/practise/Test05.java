package multithreading.practise;

public class Test05 extends Thread {

	private int x;
	
    Test05(int x)
    {
    	this.x=x;
    }
    @Override
    public void run() {
    	for(int i=0;i<=x;i++)
    	{
    		System.out.println("run :"+i);
    	}
    }
}
