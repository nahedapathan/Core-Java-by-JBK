package exceptionhandling.jbkpractise;

public class Test12 {
	
	public static void main(String[] args) {
		try {
			System.out.println("This Value :");
			for(int i=0;i<=3;i++)
			{
				System.out.println(i);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block is Execute");
		}
	}

}
