package day14;

/*
 * 오라클에 ㅅ접속해서 현재 시간을 출력해보자
 */
import java.sql.*;
import java.util.Date.*;
import db.*;
import java.text.*;
public class Test04 {
	
//	  이 클래스는 오라클에 접속해서 데이터베이스 작업을 해야한다
	CnuJDBC db;
	Connection con;
	Statement stmt;
	ResultSet rs;	// select 질의명령(조회 질의명령)에서만 리저트셋이 만들어진다
	
	public Test04() {
	//드라이버 로딩
		db = new CnuJDBC();
	
	//커넥션 만들기
		con = db.getCon();
		
	//질의명령
		String sql = "SELECT sysdate FROM dual";
		
	//스테이트먼트 꺼내오기
		stmt = db.getSTMT(con);
		
	//질의명령을 보내고 결과를 받는다
		try {
		rs = stmt.executeQuery(sql);
		
	//가상레코드포인터를 한줄 내린다
		rs.next();
	
	//데이터를 꺼낸다
		Date d = rs.getDate("sysdate");
		
	//데이터를 보기 편하게 가공한다
		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sdate = form.format(d);
		
	//출력
		System.out.println("현재시간 : " + sdate);
	//출력하면 시분초는 00:00:00으로 나옴 > getDate()에는 시분초정보가 없음 / 시간은 getTime()
		
	//시간데이터 거내오기
		form = new SimpleDateFormat("yyyy/MM/dd");
		sdate = form.format(d);
		Time t = rs.getTime("sysdate");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		String stime = form2.format(t);
		System.out.println("----------------------------------------");
		System.out.println("현재시간 : " + sdate + " " + stime);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				db.close(rs);
				db.close(stmt);
				db.close(con);
			}catch(Exception e) {}
		}
	}	
	public static void main(String[] args) {
		new Test04();
	}

}
