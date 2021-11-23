import java.util.List;

public interface IBank {
void OpenAccount(IAccount account);
void CloseAccount(int accountnumber);
List <IAccount> getAllAccounts();
List <IAccount> GetAllAccountsInDebt();
List <IAccount> GetAllAccountsWithBalance(double balanceabove);

}
