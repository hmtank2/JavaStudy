package public_transport;

public abstract class Transport {
	private int income;
	private int transportNumer;
	private int passCnt;
	
	public abstract void ride();
	public abstract void getInfo();
	
	public Transport(int transportNumer) {
		this.income = 0;
		this.transportNumer = transportNumer;
		this.passCnt = 0;
	}
	
	
	
	/////get set
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTransportNumer() {
		return transportNumer;
	}
	public void setTransportNumer(int transportNumer) {
		this.transportNumer = transportNumer;
	}
	public int getPassCnt() {
		return passCnt;
	}
	public void setPassCnt(int passCnt) {
		this.passCnt = passCnt;
	}
	
	
	
}
