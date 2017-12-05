/**
 * 
 * @author Sunil Kotagiri, Pashmeet Arora, Lovika Gosain, Rashi Tripathi, Krupa Patel
	Account Class
 */
public class Account {

	String accountType;
	int accountBalance;
	
	/**
	 * 
	 * Account class constructor 
	 */
	public Account() {
		
		// TODO Auto-generated constructor stub
		
		accountType ="";
		accountBalance = 0;
	}
	
	public Account(String accountType, int accountBalance){
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		
	}
	/**
	 * 
	 * 
	 * Account getter and setter methods for account type and accoutn balance
	 */
	public String getAccountType(Account account) {
		return account.accountType;
		
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
		
	}
	
	public int getAccountBalance(Account account) {
		return account.accountBalance;
		
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
		
	}

	

}
