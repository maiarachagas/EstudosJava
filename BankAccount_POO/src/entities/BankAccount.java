package entities;

public class BankAccount {
	
	public static final double TAXA = 5.00;
	
	private String nameAccountHolder;
	private int accountNumber;
	private double balance;
	
	public BankAccount() {	
	}
	public BankAccount(String nameAccountHolder, int accountNumber) {
		this.nameAccountHolder = nameAccountHolder;
		this.accountNumber = accountNumber;
	}
	public String getNameAccountHolder() {
		return nameAccountHolder;
	}
	public void setNameAccountHolder(String nameAccountHolder) {
		this.nameAccountHolder = nameAccountHolder;
	}
	public int getAccountNumber() {
		return accountNumber ;
	}
	public double getBalance() {
		return balance;
	}	
	public void depositedValue(double value) {
		this.balance += value;
	}
	public void withdrawValue(double value) {
		this.balance -= value;
		this.balance -= TAXA;
		
	}
	public String toString(){
		return "Account " + accountNumber + ", Holder: " + nameAccountHolder + ", Balance: " + String.format("%.2f", balance);

	}
	
}
