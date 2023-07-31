package public_transport;

public class TransportTest {
	public static void main(String[] args) {
		Student std = new Student(5000,"학생",5);
		Student james = new Student(10000,"James",6);
		Bus bus = new Bus(106);
		Subway sub = new Subway(1);
		
		std.ride(bus);
		std.getInfo();
		james.ride(sub);
		james.getInfo();
		System.out.println("");
		bus.getInfo();
		sub.getInfo();
		
		
		
		
	}
}
