package exam_04_5;

public class Cat {
	String name;
	int age;
	String	sex;
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//생성자 메서드 호출, 오버로딩
	public Cat(String name, int age) {
		this(name, age, "female");
	}
	
	public Cat(String name) {
		this(name, 2, "female");
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setCat(String name, int age) {
		this.name = name;
		this.age =age;
	}
	public void setCat(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	public void setCat(String name, int age, String sex ) {
		this.name = name;
		this.age =age;
		this.sex = sex;
	}
	
	public String getCat(String name, int age, String sex) {
		return name+" "+age+" "+sex;
	}
	
	//두개의 정수(10,20)을 한꺼번에 반환하는 방법 나중에는 콜렉터 쓰려나?
	public int[] getInt() {
		return new int[] {10,20};
	}
	//리턴 타입은 void 인데, return 키워드를 쓰는 경우
	
	
	
	
	public void xxx() {
		//} 만나기 전에 끝내는 경우. 함수를 빠져나오게 하는 것이 return 이라고 보면 됨.
		System.out.println("xxx1");
		System.out.println("xxx2");
		if (true)return; /// 중간에 xxx 메소드를 중지하고 반환함.
		System.out.println("xxx3");
	}
	public void yyy(long n){
		this.xxx();
	}
		
		
		
	
	
}
