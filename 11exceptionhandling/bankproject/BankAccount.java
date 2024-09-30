package exceptionhandling.bankproject;

public interface BankAccount {

	public void init(BankAccountDetails accDetails);
	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InvalidAmountException,InSufficientFundsException;
	public void currentBalance(); 
	public void transferMoney(BankAccount destAcc,double amount) throws InvalidAmountException,InSufficientFundsException;
}
