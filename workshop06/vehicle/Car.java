package vehicle;

public class Car extends Vehicle {
	private  double restOil;
	private  int curWeight;


	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}



	public void addOil(int oil) {
		if(oil+ this.getRestOil() < this.getOilTankSize()){
			restOil+=oil;
		}
	}
	
	public void moving(int distance) {
		this.restOil -= (distance * this.getEfficiency());
	}
	public void addWeight(int weight) {
		if(weight + this.getCurWeight() <this.getMaxWeight()) {
			this.curWeight+=weight;
		}
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\t"+this.restOil +"\t"+this.curWeight;
	}
	
		
	public double getRestOil() {
		return this.restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
}
