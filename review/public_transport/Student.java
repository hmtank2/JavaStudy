package public_transport;

public class Student {
	private int balance;
	private String name;
	private int grade;
	
	public void ride(Bus bus) {	
		this.balance -=900;
		//우선 구현, 이후 delegate
	}
	public void ride(Subway sub) {
		this.balance -=1250;
	}
	
	public void getInfo() {
		System.out.println(""+ this.name +" 님의 잔액은"+ this.balance+"원 입니다.");
		//return ""+ this.name +" 님의 잔액은 "+ this.balance +"원 입니다.";
		
	}
	public Student(int balance, String name, int grade) {
		this.balance = balance;
		this.name = name;
		this.grade = grade;
	}
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
