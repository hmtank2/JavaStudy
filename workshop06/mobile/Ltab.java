package mobile;

public class Ltab extends Mobile {

	public Ltab() {
		// TODO Auto-generated constructor stub
	}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int operate(int time) {
		// TODO Auto-generated method stub
		this.setBatterySize(this.getBatterySize()-time*10);
		return this.getBatterySize();
	}

	@Override
	public int charge(int time) {
		// TODO Auto-generated method stub
		this.setBatterySize(this.getBatterySize()+time*10);
		return this.getBatterySize();
	}

	@Override
	public String toString() {
		return "Ltab [getMobileName()=" + getMobileName() + ", getBatterySize()=" + getBatterySize() + ", getOsType()="
				+ getOsType() + "]";
	}
	
}
