package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ltab ltab = new Ltab("Ltab",500,"AP-01");
		Otab otab = new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println(ltab);
		System.out.println(otab);
		
		System.out.println("");
		ltab.charge(10);
		otab.charge(10);
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println(ltab);
		System.out.println(otab);

		System.out.println("");
		ltab.operate(5);
		otab.operate(5);
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
		System.out.println(ltab);
		System.out.println(otab);

		
		
	}

}
