package db;

/**
 * 이 클래스느 오라클 데이터베이스 작업에 앞서 요구되는 기본 작업을 해주는 곳이다
 * @author user
 * @since 2021.11.11
 * @version v.1.0
 * 
 * 		작업이력 ]	 	
 * 			2021/11/11 - 클래스제작 - 담당자 : 나
 *
 */

import java.sql.*;
public class CnuJDBC {
	
	private String url, id, pw;
	public CnuJDBC() {
		this("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	}
	
	public CnuJDBC(String url, String id, String pw) {
	
		/*
		 *  이 클래스는 new 되는 순간은 오라클을 이용한 DB 작업을 해야되는 상황일 것이다
		 *  따라서 , 이 클래스가 객체가 되는 순간, 필요한 드라이버를 로딩해두어 사용할 준비를 하자 
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("§§§§§드라이버§로딩§실패§§§§§");
			e.printStackTrace();
		}
			this.url = url;
			this.id = id;
			this.pw = pw;
	}		
	//커넥션을 만들어서 반환해주는 함수
	public Connection getCon() {
	//scott계정에 접속해서 반환해주는 함수
		Connection con = null;
	//드라이버 매니저 함수는 예외전이 함수라 반드시 예외처리해줘야함
		try {
		con = DriverManager.getConnection(url, id, pw);
		}catch(SQLException e) {
			e.printStackTrace();
		}
			return con;
	}
	
	//스테이트먼트 만들어서 반환해주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//preparedstatement 만들어서 반환해주는 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}	
	
	//사용이 끝난 자원을 닫아주는 함수
	public void close(Object o) {
		//이 함수가 실행될때, 커넥션 / 스테이트먼트 / 프레페어드 스테이트먼트를 입력해서 실행할지 / 리저트셋을 닫아주는 작업을 할지는 모른다
		//따라서, 입력된 데이터의 타입을 확인하고 그 타입에 따라 처리하면 된다
		try {
			if(o instanceof Connection) {
				((Connection) o).close();	// (Connection) o.close(); > o의 close() 호출 결과를 Connection으로 형변환
			}else if(o instanceof Statement) {
				((Statement) o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			}else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
