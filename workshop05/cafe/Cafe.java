package cafe;

public class Cafe{
	
	private Coffee[] coffeeList=new Coffee[3];
	private int index=0;
	public Cafe() {
	}
	public int totalPrice() {
		int sum = 0;
		for(int i = 0;i<coffeeList.length;i++) { ////<<<<<<
			sum=+coffeeList[i].getPrice();
		}
		return sum;
	}
	
	public void setCoffee(Coffee coffee) {
		if(index<=2) {
			//System.out.println(index);
			//System.out.println(coffeeList.length);
			coffeeList[index]=coffee;
			++index;
			
		}else{
			System.out.println("더이상 저장할 수 없습니다.");
		}
		
	}
	
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
}
