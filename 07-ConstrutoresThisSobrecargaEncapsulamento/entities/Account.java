package entities;

public class Account {
	
	private int accountNumber;
	private String userName;
	private double balance;
	
	public Account (int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
	}
	
	public Account (int accountNumber, String userName, double balance) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = balance;
	}
	
	public int getAccount () {
		return accountNumber;
	}
	
	public String getName () {
		return userName;
	}
	
	public void setName (String newName) {
		this.userName = newName;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void addValue (double addValue) {
		this.balance += addValue;
	}
	
	public void withdraw (double withdraw) {
		this.balance -= withdraw + 5;
	}
	
	public String toString() {
		return
			"Account " 
			+ getAccount()
			+ ", Holder: "
			+ getName()
			+ String.format(", Balance: $ %.2f%n", getBalance());
	}
	
	
	
}
