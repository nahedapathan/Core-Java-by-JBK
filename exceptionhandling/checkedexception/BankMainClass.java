package exceptionhandling.checkedexception;

public class BankMainClass {

	public static void main(String[] args) {
		BankWithdraw bank=new BankWithdraw();
		try {
			bank.Withdraw(25);
		} catch (LowBalanceException | InsufficientFundsException e) {
		
			e.printStackTrace();
		}
	}
}
