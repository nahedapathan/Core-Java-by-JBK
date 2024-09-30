package exceptionhandling.bankproject;

public class HDFCAccount implements BankAccount{

	private long accNum;
	private String accHName;
	private double balance;
	
	@Override
	public void init(BankAccountDetails accDetails) {
		this.accNum=accDetails.getAccNum();
		this.accHName=accDetails.getAccHName();
		this.balance=accDetails.getBalance();
		
	}
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("Do not Pass -ve number as Number");
		}
		balance=balance+amount;
		
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException,InSufficientFundsException {
		if(amount<=0)
		{
			throw new InvalidAmountException("Do not Pass -ve number as Amount");
		}
		if(amount>balance)
		{
			throw new InSufficientFundsException("Insufficient Funds");
		}
		
	}

	@Override
	public void currentBalance() {
		System.out.println(balance);
	}

	@Override
	public void transferMoney(BankAccount destAcc, double amount) throws InvalidAmountException,InSufficientFundsException {
		this.withdraw(amount);
		destAcc.deposit(amount);
		System.out.println("Money Transferred from HDFC Account ");
	}

	

}
