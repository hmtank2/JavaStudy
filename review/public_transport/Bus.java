package public_transport;

public class Bus extends Transport {

	public Bus(int transportNumer) {
		super( transportNumer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ride() {
		this.setIncome(this.getIncome()+900);
		this.setPassCnt(this.getPassCnt()+1);

	}

	@Override
	public void getInfo() {
		System.out.println( ""+ this.getTransportNumer() +" 번의 승객은 "+ this.getPassCnt() +"명 이고 수입은 "+ this.getIncome() +"원 입니다.");
		//return ""+ this.getTransportNumer() +" 번의 승객은 "+ this.getPassCnt() +"명 이고 수입은 "+ this.getIncome() +"원 입니다.";

	}

}
