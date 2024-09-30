package exceptionhandling.checkedexception;

public class Login {
	
	void login(String user,String password) throws LoginFailedException
	{
		if(user != password)
		{
			throw new LoginFailedException("InValid Login Details ");
		}
		System.out.println("Successfully Registered !!!");
	}

}
