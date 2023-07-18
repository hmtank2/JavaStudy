package Account;

public class TestAccount {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		System.out.println("계좌정보 "+account.getAccount()+ "현재잔액 : "+account.getBalance());
		account.withdraw(600000);
		account.deposit(20000);
		System.out.println("계좌정보 "+account.getAccount()+ "현재잔액 : "+account.getBalance());
		System.out.println("이자 : "+account.calculateInterest());
		
		
				
	}
}
