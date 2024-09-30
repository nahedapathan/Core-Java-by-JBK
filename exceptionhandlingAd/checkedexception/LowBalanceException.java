package exceptionhandling.checkedexception;

public class LowBalanceException extends Exception {

	public LowBalanceException(String string) {
		super(string);
	}

}
