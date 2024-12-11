package exceptionhandling.checkedexception;

public class LoginFailedException extends Exception {

	public LoginFailedException(String string) {
		super(string);
	}

}
