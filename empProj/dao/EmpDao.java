package empProj.dao;

/**
 * 이 클래스는 사원정보테이블의 데이터베이스 작업을 전담해서 처리할 곳

 * @author 
 * @since
 * @version
 * @see 
 * 			java.sql.*
 * 			db.CnuJDBC
 * 			empProj.sql.EmpSQl
 * 			empProj.VO.EmpVO
 * 			
 * 			작업이력 ]	
 * 				2021.11.11 - 	담당자 :
 * 								클래스제작
 * 							 	직급조회 작업 처리 코드 추가
 * 															 
 */
//히터나오니까 너무 좋다.. 마음까지 훈훈해.....
import java.sql.*;

import java.util.*;
import db.*;
import empProj.VO.*;
import empProj.sql.*;


public class EmpDao {
	CnuJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	EmpSQL eSQL;
	public EmpDao() {
	//이 클래스느 객체가 되는 순간 데이터베이스 작업을 할 준비가 되어있어야한다
	//우리는 이 기능을 이미 CnuJDBC 클래스에 구현해두었다
	//따라서, 그 클래스를 new 시켜 사용하면 된다
		
		db = new CnuJDBC(); //드라이버 로딩 완료
	
		//이 클래스에서는 emp 테이블에 관련된 질의명령을 사용해야한다
		//우리는 이 질의명령을 모아놓은 다른 클래스를 제작해두었으므로 그 클래스를 사용한다
		eSQL = new EmpSQL();
	}
	
	//모든 사원의 직급조회 데이터베이스 작업 전담 처리 함수
	public ArrayList<EmpVO> getJob() {
		//어레이리스트에 담을 것임
		//1. 커넥션 꺼내오기
		con = db.getCon();
		
		//2. 반환값 변수 만들기
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		//3. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_ALL_JOB);
		
		//4. 명령전달도구 준비
		stmt = db.getSTMT(con);
		try {
			//5. 질의명령 보내서 결과받고
			rs = stmt.executeQuery(sql);
			
			//6. 데이터 꺼내서 VO에 담고
			while(rs.next()) {
				//한명씩 VO 만들고
				EmpVO eVO = new EmpVO();
				eVO.setEno(rs.getInt("empno"));
				eVO.setName(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				
				//7. 리스트 VO에 담고
				list.add(eVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		
		//8. 리스트 반환
		return list;
	}
	
	
	
	//사원의 급여를 수정하고 정보를 반환해주는 작업 전담처리 함수
	public EmpVO editSal(String name, int sal) {
	//커넥션 꺼내기
		con = db.getCon();
		
	//질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.EDIT_ENO_SAL);
		
	//전달도구 준비하기
		pstmt = db.getPSTMT(con, sql);
		EmpVO eVO = new EmpVO();
		try {
			//질의명령 완성
			pstmt.setInt(1, sal);
			pstmt.setString(2, name);
			
			//질의명령결과 받기
			int cnt = pstmt.executeUpdate();
			eVO.setCnt(cnt);
			if(cnt != 0) {
			//질의명령 다시받기
			sql = eSQL.getSQL(eSQL.SEL_INFO_NAME);
			//열려있는 pstmt 닫기
			db.close(pstmt);
			//전달도구 준비
			pstmt = db.getPSTMT(con, sql);
			//질의명령 완성하기
			pstmt.setString(1, name);
			//질의명령결과 받기
			rs = pstmt.executeQuery();
			//데이터 꺼내서 VO에 담기
			rs.next();	//작업진행줄 한칸 내리기
			eVO.setEno(rs.getInt("empno"));
			eVO.setName(rs.getNString("ename"));
			eVO.setSal(rs.getInt("sal"));
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(eVO.getCnt()==1) {
				db.close(rs);
			}
			db.close(pstmt);
			db.close(con);
		}
		//반환
		return eVO;
	}
	
	
	//모든 사원의 사원정보와 부서정보, 급여 등급 조회를 전담하는 함수
	public void getSalgrade() {
	//커넥션 준비
	con = db.getCon();

	//반환값 변수 만들기
	ArrayList slist = new ArrayList();
	
	//질의명령 가져오기 
	
	
	//질의명령 만들기
	
	//질의명령을 보낼 도구 만들어 보내기
	
	//결과받기
	
	//반환하기
	
	}

}
