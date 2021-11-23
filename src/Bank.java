import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
	protected List <IAccount> lst;
	public Bank () {
		lst = new ArrayList<IAccount>();
	}
	@Override
	public void OpenAccount(IAccount account) {
		if (!(lst.contains(account)))
		{
			lst.add(account);
			System.out.println("entered succesfully");
		}
	}

	@Override
	public void CloseAccount(int accountnumber) {
		int i;
		IAccount temp;
		for (i=0;i<lst.size();i++) {
			temp = lst.get(i);
			if (temp.GetAccountNumber() == accountnumber) {
				if (temp.GetCurrentBalance()<0)
					System.out.println("Sorry , you cant close your account while you in debt");
				else
				{
					lst.remove(i);
					System.out.println("we succesfully removed you from the bank");
				}
			}
		}
		
	}

	@Override
	public List<IAccount> getAllAccounts() {
		return lst;
	}

	@Override
	public List<IAccount> GetAllAccountsInDebt() {
		List <IAccount> lstDebt = new ArrayList<IAccount>();
		int i;
		for (i=0;i<lst.size();i++) {
			if (lst.get(i).GetCurrentBalance() < 0 ) {
				lstDebt.add(lst.get(i));
			}
		}
		return lstDebt;
	}

	@Override
	public List<IAccount> GetAllAccountsWithBalance(double balanceabove) {
		List <IAccount> lstBigger = new ArrayList<IAccount>();
		int i;
		for (i=0;i<lst.size();i++) {
			if (lst.get(i).GetCurrentBalance()>balanceabove)
				lstBigger.add(lst.get(i));
		}
		return lstBigger;

	}

}
