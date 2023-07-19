package vehicle;

public class Truck extends Car{
	
	//private int maxWeight; 
	//private double oilTankSize;
	//private double efficiency;
	//private double restOil;
	//private int curWeight;
	
	
	
	
	public Truck() {
	}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super( maxWeight, oilTankSize,efficiency);
	}
	
	public double getEfficiency() {
		return (efficiency)-0.2*(this.getCurWeight()/5) ;
	}

	private double calcOil(int distance) {
		return distance/this.getEfficiency();
	}
	
	public void moving(int distance) {
		this.restOil -= calcOil(distance);
	}
	public int getCost(int distance) {
		return (int)(3000*calcOil(distance));
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+this.efficiency;
	}

	

	

}
