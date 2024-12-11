package exceptionhandling.checkedexception;

public class DivisorMainClass {
	public static void main(String[] args) {
		Divisor div=new Divisor();
		try {
			div.division(10, 0);
		} catch (InvalidDivisorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
