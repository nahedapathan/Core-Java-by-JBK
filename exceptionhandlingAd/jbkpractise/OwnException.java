package exceptionhandling.jbkpractise;

public class OwnException extends Exception {

	public OwnException(int i) {
		super(String.valueOf(i));
	}

	public OwnException(float f) {
		super(String.valueOf(f));
	}
	
	public OwnException(char c)
	{
		super(String.valueOf(c));
	}

	public OwnException(String string) {
	   super(string);
	}

}
