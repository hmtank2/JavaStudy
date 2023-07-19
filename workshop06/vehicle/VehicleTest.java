package vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Truck car = new Truck(1000,100,5);
		System.out.println("최대적재중량   오일탱크크기   잔여오일량   현재적재중량   연비 ");
		System.out.println(car.toString());
		
		System.out.println("50L 주유 후");
		car.addOil(50);
		System.out.println(car.toString());
		System.out.println("50Km 주행 후");
		car.moving(50);
		System.out.println(car.toString());
		System.out.println("100kg 적재 후");
		car.addWeight(100);
		System.out.println(car.toString());
		System.out.println("30Km 주행 후");
		car.moving(30);
		System.out.println(car.toString());
		
		
		
	}
}
