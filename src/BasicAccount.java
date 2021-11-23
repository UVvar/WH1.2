public class BasicAccount implements IAccount {
	protected int accountnumber;
	protected double withdrawLimit;
	protected double currentbalance;
	protected double creditlimit;
	public BasicAccount(int accountnumber, double withdrawLimit) {
		this.accountnumber = accountnumber;
		this.withdrawLimit = withdrawLimit;
		this.currentbalance = 0;
		creditlimit=0;
	}
	@Override
	public void Deposit(double amount) {
		currentbalance +=amount;
		
	}
	@Override
	public double Withdraw(double amount) {
		if (amount>withdrawLimit) {
			currentbalance -= withdrawLimit;
			return withdrawLimit;
		}
		else {
			currentbalance -= amount;
			return amount;
		}
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
