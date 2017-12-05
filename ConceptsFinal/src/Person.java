/**
 * 
 * @author Sunil Kotagiri, Pashmeet Arora, Lovika Gosain, Rashi Tripathi, Krupa Patel
	Person Class
 */
public class Person {
	
	
		String firstName = "";
		String lastName = "";
		String username = "";
		String password = "";
		int accountNum = 0;
		
	/**
	 * 
	 * Person class constructor	
	 */
	public Person() {
		
		firstName = "";
		lastName = "";
		username = "";
	    password = "";
		accountNum = 0;
		
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstName, String lastName, String username, String password, int accountNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.accountNum= accountNum;
	}
	/**
	 * 
	 * 
	 * Person class getter and setter methods for first name, last name, username, password, and account number
	 */
	public String getFirstName(Person person) {
		return person.firstName;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public String getLastName(Person person) {
		return person.lastName;
		
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public String getUsername(Person person) {
		return person.username;
		
	}
	
	public void setUsername(String username) {
		this.username = username;
		
	}
	
	public String getPassword(Person person) {
		return person.password;
		
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public int getAccountNum(Person person) {
		return person.accountNum;
		
	}
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
		
	}
	/**
	 * 
	 * toString method to print out person object details
	 */
	public String toString(){
		return ("First Name: " + firstName +", Last Name: "+ lastName + ", Username: "+username + ", Password: "+password + ", Account number: "+ accountNum);
		
	}
}
