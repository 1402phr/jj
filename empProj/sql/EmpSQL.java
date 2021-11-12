package empProj.sql;
/**
 * 이 클래스는 사원정보테이블의 데이터베이스 작업에 필요한 질의명령을 모아놓고
 * 필요한 질의명령을 반환해주는 기능의 클래스
 * @author user
 * @since 2021.11.11
 * @version v.1.0
 * @see 
 * 			empPtoj.dao.EmpDao
 * 		
 * 			작업이력 ] 	
 * 				2021.11.11 - 클래스제작 - 담당자 : 
 */
public class EmpSQL {
	public final int SEL_ALL_JOB = 1001;
	public final int SEL_INFO_NAME = 1002;
	public final int SEL_ALL_SGRADE = 1003;
	
	public final int EDIT_ENO_SAL = 2001;
	
	//질의명령을 반환해주는 함수
	public String getSQL(int code) {
		StringBuffer buff= new StringBuffer();
		
		switch(code) {
		case SEL_ALL_JOB :
			buff.append("SELECT ");
			buff.append("	empno, ename, job ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_INFO_NAME :
			buff.append("SELECT ");
			buff.append("	empno, ename, sal ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	ename = ? ");
			break;
		case EDIT_ENO_SAL :
			buff.append("UPDATE ");
			buff.append("	emp ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	ename = ? ");
			break;
		case SEL_ALL_SGRADE :
			buff.append("SELECT ");
			buff.append("	emp ");
			buff.append("FROM ");
			buff.append("	grade ");
			break;
		}
		
		return buff.toString();
	}
}
