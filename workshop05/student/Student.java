package student;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public Student() {
		
	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		return (this.english+this.korean+this.math+this.science)/4.0;
	}
	public String getGrade(double avg) {
		
		//int avg = (int)getAvg();
		//String grade = null; 
		
		if (avg>=90) {
			return "A";
			//grade = "A학점";
		}else if(avg>=70) {
			return "B";
		}else if(avg>=50) {
			return "C";
		}else if(avg>=30) {
			return "C";
		}else {
			return "F";
		}
		//return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	
	
	
	
}
