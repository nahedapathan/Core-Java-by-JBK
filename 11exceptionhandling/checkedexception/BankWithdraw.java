package exceptionhandling.checkedexception;

public class BankWithdraw {
	int balance=10000;
	
	void Withdraw(double amount) throws LowBalanceException,InsufficientFundsException{
		
		if(amount<100)
		{
			throw new LowBalanceException("Balance less than 100 ");
		}
		if(amount>balance)
		{
			throw new InsufficientFundsException("Amount is Greater than Balance");
		}
		System.out.println("Your Amount is Withdraw");
	}

}
