package exceptionhandling.checkedexception;

public class VotingMainClass {
	public static void main(String[] args) {
		Voting v=new Voting();
		try {
			v.registration(3);
		}catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}

}
