package Account;

public class Account {
	private String account= "441-0290-1203";
	private int balance = 500000;
	private double interest = 7.3;
	
	public Account() {
	}
	public Account(String account, int balance, double interest) {
		this.account = account;
		this.balance = balance;
		this.interest = interest;
	}
	
	public double calculateInterest() {
		return balance*(this.interest/100);
		
	}
	public void deposit(int money) {
		this.balance +=money;
	}
	public void withdraw(int money) {
		if(money>this.balance) {
			System.out.println("출금할 수 없습니다.");
		}
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
}
