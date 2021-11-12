package day14;

import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.Date;
/*
  10번 부서 사원들의 정보를 조회하여 출력하라
 */
public class Test01 {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	ArrayList<EmpVO> list = new ArrayList<EmpVO>();
	public Test01() {
		try {
			//1. 데이터베이스 사용할 준비 = 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 접속 하나 얻어냄
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, id, pw);
			
			//3. 질의명령 만들기
			int dno = Integer.parseInt(JOptionPane.showInputDialog("부서번호 입력 : "));
			String sql = "SELECT * FROM emp WHERE 	DEPTNO = " + dno;
			
			//4. 명령전달도구 준비
			stmt = con.createStatement();
			
			//5. 실어서 보내고 결과받음
			rs = stmt.executeQuery(sql);
			
			//6. 결과데이터를 꺼내서 VO에 담기
			// > 몇개의 결과가 발생할지 모르므로 반복처리
			while(rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int eno = rs.getInt("empno");
				dno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				
			//VO에 사우너 하나의 데이터를 채운다
				EmpVO eVO = new EmpVO();
				
			//VO에 데이터 채우기
				eVO.setEno(eno);
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setMgr(mgr);
				eVO.setHiredate(hiredate);
				eVO.setSdate();
				eVO.setSal(sal);
				eVO.setComm(comm);
				eVO.setDno(dno);
				
			//7. 어레이리스트 채우기
				list.add(eVO);
			}
			
			//8. 하나씩 출력
				for(EmpVO evo : list) {
					System.out.println("사원번호 : " + evo.getEno());
					System.out.println("사원이름 : " + evo.getName());
					System.out.println("사원급여 : " + evo.getSal());
					System.out.println("입사일 : " + evo.getSdate());
					System.out.println("부서번호 : " + evo.getDno());
				}
			
			
		}catch(Exception e) {
			System.out.println("§§§§§데이터베이스§작업§실패§§§§§");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
