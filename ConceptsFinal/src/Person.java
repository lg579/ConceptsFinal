
public class Person {
	
	
		String firstName = "";
		String lastName = "";
		String username = "";
		String password = "";
		int accountNum = 0;
		
		
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

	public String toString(){
		return ("First Name: " + firstName +", Last Name: "+ lastName + ", Username: "+username + ", Password: "+password + ", Account number: "+ accountNum);
		
	}
}
