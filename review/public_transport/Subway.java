package public_transport;

public class Subway extends Transport {

	public Subway( int transportNumer) {
		super(transportNumer);
		
	}

	@Override
	public void ride() {
		this.setIncome(this.getIncome()+1250);
		this.setPassCnt(this.getPassCnt()+1);

	}

	@Override
	public void getInfo() {
		System.out.println(""+ this.getTransportNumer() +" 호선의 의 승객은 "+ this.getPassCnt() +"명 이고 수입은 "+ this.getIncome() +"원 입니다.");
		//return ""+ this.getTransportNumer() +" 호선의 의 승객은 "+ this.getPassCnt() +"명 이고 수입은 "+ this.getIncome() +"원 입니다.";

	}

}
