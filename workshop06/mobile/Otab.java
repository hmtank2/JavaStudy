package mobile;

public class Otab extends Mobile{
	
	public Otab() {
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int operate(int time) {
		// TODO Auto-generated method stub
		this.setBatterySize(this.getBatterySize()-time*12);
		return this.getBatterySize();
	}

	@Override
	public int charge(int time) {
		// TODO Auto-generated method stub
		this.setBatterySize(this.getBatterySize()+time*8);
		return this.getBatterySize();
	}

	@Override
	public String toString() {
		return "Otab [getMobileName()=" + getMobileName() + ", getBatterySize()=" + getBatterySize() + ", getOsType()="
				+ getOsType() + "]";
	}

	
}
