package com.dto;
/*
 예약 가능 지점 시 :
res.플레 넘버  res.placeno--->.플레.플레이름.

예약 신청시
플레 넘버 이름. 에약 가능 지점 조회 
지점을 입력하세요 , sysin
예약 불가 일정 : res 해당 플레이스의 res데이트
 * res number
 * client number 이름 대신. ---->client.client id
 * place no - >place.placeName , reservation date
 * 
 */
//reservation.jave vo + 렌탈 플레이스중 넘버 네임 가능

public class ClientDTO {
	int res_num;
	int res_date;
	int client_no;
	int place_no;
	String end_use;
	
	//findAllAvailable
	String place_nm;
	
	
	
	
	@Override
	public String toString() {
		return "ClientDTO [res_num=" + res_num + ", res_date=" + res_date + ", client_no=" + client_no + ", place_no="
				+ place_no + ", end_use=" + end_use + ", place_nm=" + place_nm + "]";
	}


	public ClientDTO() {
	}
	
	
	//findall 용
	public ClientDTO(int res_num, int res_date, int client_no, int place_no, String end_use) {
		this.res_num = res_num;
		this.res_date = res_date;
		this.client_no = client_no;
		this.place_no = place_no;
		this.end_use = end_use;
		this.place_nm = null;
	}



	public ClientDTO(int res_num, int res_date, int client_no, int place_no, String end_use, String place_nm) {
		this.res_num = res_num;
		this.res_date = res_date;
		this.client_no = client_no;
		this.place_no = place_no;
		this.end_use = end_use;
		this.place_nm = place_nm;
	}

	public int getRes_num() {
		return res_num;
	}

	public void setRes_num(int res_num) {
		this.res_num = res_num;
	}

	public int getRes_date() {
		return res_date;
	}

	public void setRes_date(int res_date) {
		this.res_date = res_date;
	}

	public int getClient_no() {
		return client_no;
	}

	public void setClient_no(int client_no) {
		this.client_no = client_no;
	}

	public int getPlace_no() {
		return place_no;
	}

	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}

	public String getEnd_use() {
		return end_use;
	}

	public void setEnd_use(String end_use) {
		this.end_use = end_use;
	}

	public String getPlace_nm() {
		return place_nm;
	}

	public void setPlace_nm(String place_nm) {
		this.place_nm = place_nm;
	}
	
	
	
	//String clientId;
	//String placeName;
	
	
	
	
	
	
}
