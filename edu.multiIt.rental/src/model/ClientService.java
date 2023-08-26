package model;

import java.util.List;

import com.dto.ClientDTO;


public interface ClientService {
	public List<ClientDTO> findAllAvailable()  ;
	//public List<ClientDTO> findAllAvailable2();
	public List<ClientDTO> findByPlaceNumber(int place_no) ;
	public boolean checkResDateDuplicates(int place_no, int date) ;
	public boolean makeRes(ClientDTO dto) ;

}
