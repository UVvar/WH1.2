public class PremiumAccount implements IAccount{
	protected int accountnumber;
	protected double currentbalance;
	
	public PremiumAccount(int accountnumber) {
		this.accountnumber =accountnumber;
		
	}

	@Override
	public void Deposit(double amount) {
		currentbalance +=amount;
		
}

	@Override
	public double Withdraw(double amount) {
		currentbalance -=amount;
		return amount;
	}

	@Override
	public double GetCurrentBalance() {
		// TODO Auto-generated method stub
		return currentbalance;
	}

	@Override
	public int GetAccountNumber() {
		// TODO Auto-generated method stub
		return accountnumber;
	}
}
