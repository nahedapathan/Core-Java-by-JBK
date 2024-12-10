package multithreading.practise;

public class Test07MyThread extends Thread{
	
		@Override
		public void run() {
			for(int i=0;i<=50;i++)
			{
				System.out.println(getName()+"run"+i);
			}
		}
	
}
