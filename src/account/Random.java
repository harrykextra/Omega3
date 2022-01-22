/**
 * 
 */
package account;

/**
 * @author USER
 *
 */
public class Random {
	private double balance;
	private String firstName;
	private String lastName;
	
	public Random () {}
	
	public Random(String firstName, String surname, double amount) {
		this.firstName = firstName;
		lastName = surname;
		balance = amount;
		
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void processAccount(int task, double amount)
	

}
