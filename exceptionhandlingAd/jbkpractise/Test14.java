package exceptionhandling.jbkpractise;

public class Test14 {

	public static void displayMsg() throws CustomExceptionEx2
	{
		for(int j=8;j>0;j--)
		{
			System.out.println("j= "+j);
			if(j==7)
			{
				throw new CustomExceptionEx2("This is my own CustomMessage");
			}
		}
	}
	
	public static void main(String[] args) {
	  try {
		displayMsg();
	} catch (CustomExceptionEx2 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
