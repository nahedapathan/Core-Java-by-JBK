package exceptionhandling.checkedexception;

public class LoginMainClass {
	public static void main(String[] args) {
		Login login=new Login();
		try {
			login.login("naheda", "naheda");
		} catch (LoginFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
