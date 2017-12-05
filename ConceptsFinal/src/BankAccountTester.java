import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
	private static Transaction deposit;

	//Person person1 = new Person("Amy", "Blue", "myUsername", "myPassword");
	//Person person2 = new Person("Jack", "Green", "user", "pass");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String userName;
		String passWord;
		int option=0;
		String newUsername;
		String newPassword;
		ArrayList<Transaction> trans = new ArrayList<Transaction>();
		Person person1 = new Person("Amy", "Blue", "myUsername", "myPassword", 2543);
		Person person2 = new Person("Jack", "Green", "user", "pass", 4653);
		Account checkingAccount = new Account("Checking", 50);
		Account savingsAccount = new Account("Savings", 100);
		Transaction transaction1 = new Transaction("Dunkin", "12/4/2017", 2);
		Transaction transaction2 = new Transaction("Starbucks", "12/7/2017", 5);
		Transaction transaction3 = new Transaction("CVS", "12/10/2017", 10);
		
		trans.add(transaction1);
		trans.add(transaction2);
		trans.add(transaction3);
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("The name right now is "+ person1.getFirstName(person1));
		System.out.println("change your name:");
		name = sc.nextLine();
		
		person1.firstName = name;
		
		System.out.println("The new name is: " +person1.getFirstName(person1));
		*/
		
		System.out.println("Welcome to the bank account application! Please begin to log in to your account. Enter your username:");
		userName = sc.nextLine();
		System.out.println("Enter your password: ");
		passWord = sc.nextLine();
		
		Person person = null;
		System.out.println("Welcome " + person1.getFirstName(person1) + "!");
		
		
		
		while (option != 7) {
		System.out.println("------------------------------------------------------");
		System.out.println("These are your options: ");
		System.out.println("------------------------------------------------------");
		System.out.print(		 
				"		  1. Change username\n" + 
				"		  2. Change password\n" +
				"		  3. Deposit into your account\n" + 
				"		  4. View account transactions\n" + 
				"		  5. Transfer money\n" + 
				"		  6. View account amounts\n" + 
				"		  7. Exit\n");  
		System.out.println();
		System.out.println("Please enter your option below: ");	
		option = sc.nextInt();
		int pick=0;
		if (option ==1) {
			newUsername=changeUsername(person1);
			
			person1.setUsername(newUsername);
			System.out.println("Your new username is "+ person1.getUsername(person1));
			System.out.println("Your details are now: "+ person1.toString());
			}
			
		if (option ==2) {	
				newPassword = changePassword(person1);
				person1.setPassword(newPassword);
				System.out.println("Your new password is "+ person1.getPassword(person1));
				System.out.println("Your details are now: "+ person1.toString());
			
		}
		
		if (option ==3) {
			System.out.println("You have choosen option 3: ");
			System.out.println("The amount in your checking account is: "+checkingAccount.getAccountBalance(checkingAccount));
			System.out.println("The amount in your savings account is: "+savingsAccount.getAccountBalance(savingsAccount));
			System.out.println("Would you like to deposit into your checking account(1) or savings account(2)");
			pick = sc.nextInt();
			Object Transaction;
			if (pick ==1) {
				 deposit= makeDepositChecking(checkingAccount);
				trans.add(deposit);
			}
			if (pick ==2) {
				
			
				deposit= makeDepositSavings(savingsAccount);
				trans.add(deposit);
			}
			
			
		}
		
		if (option ==4) {
			//for (int i=0;i<trans.size();i++) {
				System.out.println("Your transaction details are: " );
				System.out.println(trans.toString());
				
			//}
			
		}
		
		if (option ==5) {
			pick =0;
			System.out.println("To transfer money from checkings to savings, enter 1. To transfer money from savings to checkings, enter 2");
			pick = sc.nextInt();
			
			if (pick ==1) {
				Transaction transfer = transferCheckingToSavings(checkingAccount, savingsAccount);
				trans.add(transfer);
				System.out.println("Transfer is complete!");
				System.out.println("The amount in your checking account is: "+checkingAccount.getAccountBalance(checkingAccount));
				System.out.println("The amount in your savings account is: "+savingsAccount.getAccountBalance(savingsAccount));
			}
			
			if (pick ==2) {
				Transaction transfer = transferSavingsToChecking(checkingAccount, savingsAccount);
				trans.add(transfer);
				System.out.println("Transfer is complete!");
				System.out.println("The amount in your checking account is: "+checkingAccount.getAccountBalance(checkingAccount));
				System.out.println("The amount in your savings account is: "+savingsAccount.getAccountBalance(savingsAccount));
				
			}
			
		}
		
		
		if (option==6) {
			System.out.println("The amount in your checking account is: "+checkingAccount.getAccountBalance(checkingAccount));
			System.out.println("The amount in your savings account is: "+savingsAccount.getAccountBalance(savingsAccount));
			
		}
		
		
		}
		
		System.out.println("Thank you for using our banking system! You have been logged off!");
		
		}
		
		
		
	
	
	public static  String changeUsername(Person person1) {
		Scanner sc = new Scanner(System.in);
		String currentUsername;
		String newUsername;
		System.out.println("You have choosen option 1: ");
			System.out.println("Your current username is "+ person1.getUsername(person1));
			System.out.println("Enter a new username");
			newUsername = sc.nextLine();
			return newUsername;
			
		}
	
	
	public static String changePassword(Person person1) {
		Scanner sc = new Scanner(System.in);
		String currentPassword;
		String newPassword;
		System.out.println("You have choosen option 2: ");
		
			System.out.println("Your current password is "+ person1.getPassword(person1));
	
			System.out.println("Enter a new password");
			newPassword = sc.nextLine();
			return newPassword;
			
		}
	
	public static Transaction makeDepositChecking(Account checkingAccount) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int amount=0;
		
		checkingAccount.setAccountType("Checking");
		System.out.println("Enter how much you would like to deposit: ");
		amount= sc.nextInt();
		int currentAmount = checkingAccount.getAccountBalance(checkingAccount)+amount;
		checkingAccount.setAccountBalance(currentAmount);
		System.out.println("Your new checking account balance is: " +checkingAccount.getAccountBalance(checkingAccount));
		//trans.add("DEPOSIT","Current date", amount);
		Transaction deposit = new Transaction("DEPOSIT - Checking", "Current date", amount); // Creating a new object
		return deposit;
		//trans.add(deposit);
	}
		
	public static Transaction makeDepositSavings(Account savingsAccount) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int amount=0;
		
		savingsAccount.setAccountType("Savings");
		System.out.println("Enter how much you would like to deposit: ");
		amount= sc.nextInt();
		int currentAmount = savingsAccount.getAccountBalance(savingsAccount)+amount;
		savingsAccount.setAccountBalance(currentAmount);
		System.out.println("Your new savings account balance is: " +savingsAccount.getAccountBalance(savingsAccount));
		Transaction deposit = new Transaction("DEPOSIT - Savings", "Current date", amount); // Creating a new object
		return deposit;
	}
	
	public static Transaction transferCheckingToSavings(Account checkingAccount, Account savingsAccount) {
		Scanner sc = new Scanner(System.in);
		int amount=0;
		System.out.println("Enter how much you would like to transfer out: ");
		amount= sc.nextInt();
		int currentAmountChecking = checkingAccount.getAccountBalance(checkingAccount)-amount;
		checkingAccount.setAccountBalance(currentAmountChecking);
		int currentAmountSavings = savingsAccount.getAccountBalance(savingsAccount)+amount;
		savingsAccount.setAccountBalance(currentAmountSavings);
		
		Transaction transfer = new Transaction("TRANSFER - To Savings", "Current date", amount);
		return transfer;
	}
	
	public static Transaction transferSavingsToChecking(Account checkingAccount, Account savingsAccount) {
		Scanner sc = new Scanner(System.in);
		int amount=0;
		System.out.println("Enter how much you would like to transfer out: ");
		amount= sc.nextInt();
		int currentAmountSavings = savingsAccount.getAccountBalance(savingsAccount)-amount;
		savingsAccount.setAccountBalance(currentAmountSavings);
		int currentAmountChecking = checkingAccount.getAccountBalance(checkingAccount)+amount;
		checkingAccount.setAccountBalance(currentAmountChecking);
		Transaction transfer = new Transaction("TRANSFER - To Checkings", "Current date", amount);
		return transfer;
	}
	

}
