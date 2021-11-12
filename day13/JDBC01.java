package day13;

import java.sql.*;

/*
  scott 계정에서 사원들의 이름과 급여를 조회하여 출력하라
 */
public class JDBC01 {

	Connection con;
	ResultSet rs;
	Statement stmt;
	public JDBC01() {
		//1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("ㅎㅎ드라이버 로딩 성공ㅎㅎ");
		
		//2. 오라클 세션을 받아온다
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	//@앞은 동일한데 뒤는 sql 디벨로퍼 계정보고 쓰면됨
			String id = "scott";
			String pw = "tiger";
			
			con = DriverManager.getConnection(url, id, pw);
		
		//3. 접속성공
			System.out.println("~~접속성공~~");
		
		//4. 이제 질의명령을 작성해서 전달 도구에 담아 보내면 됨 
			//명령 준비
			String sql = "SELECT ename, sal FROM emp";	// 질의명령안에는 절대 세미콜론이 있어서는 안됨 > jdbc가 알아서 붙여보냄
			
			//전달도구 준비
			stmt = con.createStatement();	//스테이트먼트가 인터페이스라 직접 뉴 못시킴
			
			//도구에 실어서 전달하는 동시에 결과 받기
			rs = stmt.executeQuery(sql);	//결과는 rs에 담김
			
			//다만 이 경우, 데이터가 여러개라 반복처리한다
			while(rs.next()) {
				String name = rs.getString("ename");
				int sal = rs.getInt("sal");
				
		//5. 출력
				System.out.println(name + " : " + sal);
			}
			
		}catch(Exception e) {
			System.out.println("ㅠㅠ드라이버 로딩 실패ㅠㅠ");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new JDBC01();
	}

}
