package DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ClientDTO;



public class ClientDAO {
	public List<ClientDTO> findAllAvailable(SqlSession session){
		List<ClientDTO> list = session.selectList("DeptMapper.findAllAvailable2");
		return list;
	}
	public List<ClientDTO> findByPlaceNumber(SqlSession session, int place_no){
		List<ClientDTO> list = session.selectList("DeptMapper.findByPlaceNumber", place_no);
		return list;
	}
	//res date 용 max res_date 구하기
	public int getMaxResNum(SqlSession session) {
		int maxDate = session.selectOne("DeptMapper.getMaxResDate");
		return maxDate;
	}
	//
	public int makeRes(SqlSession session,ClientDTO dto) {
		
		int n  = session.insert("DeptMapper.addDept",dto );
		return n;
	}
}
