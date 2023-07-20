package vehicle;

public class Truck extends Car{
	
	//private int maxWeight; 
	//private double oilTankSize;
	//private double efficiency;
	//private double restOil;
	//private int curWeight;
	
	
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getEfficiency() {
		return (super.getEfficiency())-0.2*(this.getCurWeight()/5) ;
	}

	private double calcOil(int distance) {
		return distance/this.getEfficiency();
	}
	
	@Override
	public void moving(int distance) {
		this.setRestOil(this.getRestOil()-calcOil(distance));
		//this.getRestOil();
		//그러니까 인스턴스는 heap 영역 안에서 최고 조상부터 계속 만들어져서 vehicle의 private, car의 private 등이 전부 만들어지고 마지막으로 truck 클래스에서 구현된 부분들이 만들어지는데
		//이때 truck에서 구현된 메서드 등으로는 조상의 private 들에 접근할 수 없는 것이다 이렇게 정리를 하면 되는것인지
	}
	public int getCost(int distance) {
		return (int)(3000*calcOil(distance));
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+super.getEfficiency();
	}

	

	

}
