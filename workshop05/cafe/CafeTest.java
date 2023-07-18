package cafe;

public class CafeTest {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Coffee ame = new Coffee("Americano", 4000);
		Coffee caffe = new Coffee("Caffelatte", 4000);
		Coffee mach = new Coffee("Macchiato", 4000);
		
		cafe.setCoffee(ame);
		cafe.setCoffee(caffe);
		cafe.setCoffee(mach);
		
		for(int i = 0; i<cafe.getCoffeeList().length; i++)
		{
			System.out.println(i+" i");
			System.out.println(cafe.getCoffeeList()[i].toString());
		}
		
		System.out.println(cafe.totalPrice());
	}
	
}
