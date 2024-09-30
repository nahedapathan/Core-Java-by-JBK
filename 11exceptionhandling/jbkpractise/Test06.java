package exceptionhandling.jbkpractise;

import java.io.IOException;

public class Test06 {
	
	static void mymethod(int num) throws IOException,ClassNotFoundException
	{
		if(num==1)
		{
			throw new IOException("Exception Message ");
		}
		else
		{
			throw new ClassNotFoundException("Exception Message 2");
		}
	}

	public static void main(String[] args) {
		try {
			mymethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
