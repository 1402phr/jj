package day14;


import java.sql.*;
import java.sql.Date;
import java.util.*;
import javax.swing.*;

public class Test02 {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	ArrayList<EmpVO> list = new ArrayList<EmpVO>();
	public Test02() {
		try{
			// 1. 데이터베이스 사용할 준비하고(드라이버 로딩하고)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 커넥션 얻어내고
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// 3. 질의명령 만들고
			String sql = "SELECT * FROM emp WHERE deptno = ?";
			// 4. 명령전달도구 준비하고
			pstmt = con.prepareStatement(sql);
			// 5. 질의명령 완성
			int dno = Integer.parseInt(JOptionPane.showInputDialog("부서번호입력 :"));
			pstmt.setInt(1, dno);	//물음표가 여러개일 경우, 왼쪽부터 세서 번호부여, 따옴표/세미콜론 넣지 마세요
			rs = pstmt.executeQuery();
			// 6. 결과에서 데이터꺼내서 VO에 담고
			// ==> 몇개의 결과가 발생할지 모르므로 반복해서 처리한다.
			while(rs.next()) {
				// VO에 사원 한명의 데이터를 채운다.
				EmpVO eVO = new EmpVO();
				// VO에 데이터 채우고
				eVO.setEno(rs.getInt("empno"));
				eVO.setName(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				eVO.setMgr(rs.getInt("mgr"));
				eVO.setSal(rs.getInt("sal"));
				eVO.setComm(rs.getInt("comm"));
				eVO.setDno(rs.getInt("deptno"));
				eVO.setHiredate(rs.getDate("hiredate"));
				eVO.setSdate();
				
				// 7. ArrayList 채우고
				list.add(eVO);
			}	
		} catch(Exception e) {
			System.out.println("§§§§§데이터베이스§작업§실패§§§§§");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		} 
		
		for(EmpVO evo : list) {
			System.out.println("사원번호 : " + evo.getEno());
			System.out.println("사원이름 : "+ evo.getName());
			System.out.println("직급 : "+ evo.getJob());
			System.out.println("상사번호 : "+ evo.getMgr());
			System.out.println("급여 : "+ evo.getSal());
			System.out.println("커미션 : "+ evo.getComm());
			System.out.println("부서번호 : "+ evo.getDno());
			System.out.println("입사일 : "+ evo.getHiredate());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
