package exam_04_5;

public class TestPet {
	public static void main(String[] args) {
		Cat c = new Cat("야옹이",2,"female");
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		System.out.println("");
		//수정
		c.setName("망치");
		c.setAge(3);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		System.out.println("");
		c.setCat(4, "중성");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		
		System.out.println(c.getCat("나비", 2, "암컷"));
	
		/////////////\
		c.xxx();
		System.out.println("end");
		
		c.yyy(10);
		
		
		
		
		
		
		
		
		
	}
	
	
}
