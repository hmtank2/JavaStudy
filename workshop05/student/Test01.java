package student;

public class Test01 {
	public static void main(String[] args) {
		Student Kim= new Student("Kim",100,90,95,89);
		Student Lee= new Student("Lee",60,70,99,98);
		Student Park= new Student("Park",68,86,60,40);
		
		System.out.println("Kim 평균 : "+Kim.getAvg()+" 학점"+Kim.getGrade(Kim.getAvg()));
		System.out.println("Lee 평균 : "+Lee.getAvg()+" 학점"+Lee.getGrade(Lee.getAvg()));
		System.out.println("Park 평균 : "+Park.getAvg()+" 학점"+Park.getGrade(Park.getAvg()));
		
		System.out.println(Kim.getName()+"평균 : "+Kim.getAvg()+" 학점"+Kim.getGrade(Kim.getAvg()));
	}
}
