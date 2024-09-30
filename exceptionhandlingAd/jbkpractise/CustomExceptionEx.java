package exceptionhandling.jbkpractise;

public class CustomExceptionEx extends Exception {

	String str1;
	CustomExceptionEx(String str2)
	{
		str1=str2;
	}
	
	public String toString()
	{
		return("OutPutString "+str1);
	}
}
