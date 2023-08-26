package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.ClientDTO;

import DAO.ClientDAO;
import model.ClientService;
//import com.service.DeptServiceImpl;

public class ClientServiceImpl implements ClientService{
	
	//중복체크
	
	public boolean checkResDateDuplicates(int place_no, int date)  {
		//checkForDuplicates(); try catch 안씀
		List<ClientDTO> list = findByPlaceNumber(place_no);
		List<Integer> newArray = new ArrayList<Integer>();//좀 땜빵인데 이러면 20을 넘길 수 없음
		for (ClientDTO dto : list) {
			newArray.add(dto.getRes_date());
		}
		newArray.add(date);
		Set<Integer> numSet = new HashSet<>(newArray);
		return numSet.size() == newArray.size();
		
	}
	
	//회원 가입
	
	//로그인
	
	//지점 조회 예약가능한
	public List<ClientDTO> findAllAvailable()  {
		List<ClientDTO> list = null;
		//squ session 얻기
		SqlSession session = MySqlSessionFactory.getSession();
		try{////////DAO 연동//////////
			ClientDAO dao = new ClientDAO();
			
			list = dao.findAllAvailable(session);
		}finally {
			session.close();	
		}

		return list;	
	}
	//예약 불가 시간 조회
	public List<ClientDTO> findByPlaceNumber(int place_no) {
		List<ClientDTO> list = null;
		//squ session 얻기
		SqlSession session = MySqlSessionFactory.getSession();
		try{////////DAO 연동//////////
			ClientDAO dao = new ClientDAO();
			
			list = dao.findByPlaceNumber(session, place_no);
		}finally {
			session.close();	
		}

		return list;	
	}
	
	
	//예약 신청
	public boolean makeRes (ClientDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		try{////////DAO 연동//////////
		ClientDAO dao = new ClientDAO();
		int maxNum = dao.getMaxResNum(session);
		dto.setRes_num(maxNum+1);//맥스 넘은 외부에서알 필요 없으니까...
		int n = dao.makeRes(session, dto);
		session.commit();
		}finally {
			session.close();	
		}
		return false;

	}
		
	//예약 조회
	
	//예약 취소
	
	//예약 시간 리스트 조회를 위한 메서드
	
	//수정
	
	
	



}

