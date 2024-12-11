package exceptionhandling.jbkpractise;

public class Test02 {
	
	public static void main(String[] args) {
		int[] arr= {1,2};
		try {
			System.out.println("The 10th value of Array is :"+arr[10]);
		}catch(Exception e)
		{
			System.out.println("The Error is :"+e);
		}
	}

}
