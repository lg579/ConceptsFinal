
public class Transaction {

	String location;
	String date;
	int transactionAmount;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
		
		location = "";
		date = "";
		transactionAmount =0;
	}

	public Transaction(String location, String date, int transactionAmount){
		this.location = location;
		this.date = date;
		this.transactionAmount = transactionAmount;
		
	}
	
	public String getLocation(Transaction transaction) {
		return transaction.location;
		
	}
	
	public void setLocation(String location) {
		this.location = location;
		
	}
	
	public String getDate(Transaction transaction) {
		return transaction.date;
		
	}
	
	public void setDate(String date) {
		this.date = date;
		
	}
	
	public int getTransactionAmount(Transaction transaction) {
		return transaction.transactionAmount;
		
	}
	
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
		
	}
	
	public String toString(){
		return ("\nTransaction location: " + location +", Transaction date: "+ date + ", Transaction amount: "+transactionAmount + " ");
		
	}
	
}
