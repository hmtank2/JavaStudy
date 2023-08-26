package edu.multiIt.rental;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.config.MySqlSessionFactory;
import com.dto.ClientDTO;
//import com.dto.DeptDTO;

import model.ClientService;
import model.ClientServiceImpl;

//import model.DeptService;
//import model.DeptServiceImpl;

public class ProjectRUn {

	public static void main(String[] args) throws Exception {
		// configuration xml 파일
		//String resource = "com/config/Configuration.xml";

		//InputStream inputStream = Resources.getResourceAsStream(resource);
		//SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		//SqlSession session = sqlSessionFactory.openSession();
		
		//List<ClientDTO> list = null;
		//SqlSession session = MySqlSessionFactory.getSession();
		//list = session.selectList("DeptMapper.findAllAvailable");
		//for (ClientDTO xxx : list) {
		//	System.out.println(xxx);
		//}
		//reservation과 필드변수 완전히 일치시켰을 때는 작동하는거 확인
		
		//구현 화면 보여주기
		while(true) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("********** 회원제 게시판 프로그램 **********");
			System.out.println("[1. 예약 가능 지점]");//res place findall
			System.out.println("[2. 예약 신청]");
			System.out.println("[3. 예약 조회]");
			System.out.println("[9. 로그아웃]");
			System.out.println("[0. 프로그램 종료]");
			
			System.out.println("메뉴를 입력해주세요 >> ");
			String num = scan.nextLine();
			if("1".equals(num)) 
			{
				ClientService service = new ClientServiceImpl();// 다형성
				List<ClientDTO> list = service.findAllAvailable();
				System.out.println("부서번호\t 부서명\t 부서위치");
				System.out.println("------------------------------");
				for (ClientDTO dto : list) {
					System.out.println(dto); // dto.toString	
				}
				// 예약 불가 일정 보기
				System.out.println("지점을 입력해주세요 >> ");
				num = scan.nextLine();
				list = service.findByPlaceNumber(Integer.parseInt(num));//
				System.out.println("예약 불가 일정");
				for (ClientDTO dto : list) {
					System.out.println(dto.getRes_date()); // dto.toString	
				}
			}
			
			else if("2".equals(num)) {
				ClientService service = new ClientServiceImpl();// 메서드 하나로 줄어야하나?
				List<ClientDTO> list = service.findAllAvailable();
				System.out.println("부서번호\t 부서명\t 부서위치");
				System.out.println("------------------------------");
				for (ClientDTO dto : list) {
					System.out.println(dto); // dto.toString	
				}
				// 예약 불가 일정 보기
				System.out.println("지점을 입력해주세요 >> ");
				num = scan.nextLine();
				list = service.findByPlaceNumber(Integer.parseInt(num));//
				System.out.println("예약 불가 일정");
				//이러면 메서드 하나로 줄이기 힘든데
				
				for (ClientDTO dto : list) {
					System.out.println(dto.getRes_date()); // dto.toString	
				}
				
				//예약 신청 중복 확인
				int placeNum = Integer.parseInt(num);
				System.out.println("예약일정을 입력해주세요 >> ");
				num = scan.nextLine();
				int date = Integer.parseInt(num);
				boolean checkResult = service.checkResDateDuplicates(placeNum ,date);
				if(checkResult) {
					System.out.println("예약 가능한 일정입니다.");
					//예약 신청하기
					ClientDTO dto = new ClientDTO();
					dto.setClient_no(5);
					dto.setEnd_use("n");// 둘은 고정
					dto.setRes_date(date);
					dto.setPlace_no(placeNum);
					service.makeRes(dto);
					System.out.println("신청이 되었습니다. ");
				}
			}
			
			else if("3".equals(num)) {
				
			}
			
			else if("0".equals(num)) //else if
			{
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
		
	}

}
/*
 * 

*/