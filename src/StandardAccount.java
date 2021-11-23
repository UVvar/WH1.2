public class StandardAccount implements IAccount {
	protected double currentbalance;
	protected int accountNumber;
	protected double creditLimit;
	public StandardAccount(int acountNumber , double creditLimit) {
		this.accountNumber = accountNumber;
		this.creditLimit = creditLimit;
		currentbalance = 0;
	}
	@Override
	public void Deposit(double amount) {
		currentbalance += amount;
		
	}
	@Override
	public double Withdraw(double amount) {
		if (currentbalance - amount < creditLimit && currentbalance != creditLimit ) {
			double temp =  currentbalance +(-creditLimit);
			currentbalance = -temp;
			return temp;
		}
		else if (currentbalance == creditLimit) {
			return 0;
		}
		else
		{
			currentbalance -= amount;
			return amount;
		}
	}
	@Override
	public double GetCurrentBalance() {
		return currentbalance;
	}
	@Override
	public int GetAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
}
