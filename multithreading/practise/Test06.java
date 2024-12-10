package multithreading.practise;

class AddThread extends Thread
{
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			sum=sum+i;
			System.out.println("Summation :"+sum);
		}
	}
}

class SubThread extends Thread
{
	@Override
	public void run() {
		int diff=0;
		for(int i=0;i<=20;i++)
		{
			diff=diff-i;
			System.out.println("Substraction :"+diff);
		}
	}
}

public class Test06 {

	public static void main(String[] args) {
		AddThread adt=new AddThread();
		SubThread ast=new SubThread();
		adt.start();
		ast.start();
	}
}
