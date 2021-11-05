package day08;
/**
 * 이 함수는 사원정보테이블 데이터 베이스에 필요한 질의명령을 관리하는 클래스
 * @author me
 * @since 2021.11.03
 * @version v.1.0
 * @see 
 * 			작업이력 ]
 * 				2021.11.03 - 클래스 작성 - 담당자 : me
 */

public class EmpSQL {
	public final int SEL_NAME_ALL = 1001;
	public final int SEL_INFO_ENO = 1002;
	
	//질의명령을 반환해주는 함수
	public String getSQL(int code) {
		 StringBuffer buff = new  StringBuffer();
		 
		 switch(code) {
		 case 1001:
		 buff.append("SELECT ");
		 buff.append("	ename	");
		 buff.append("FROM ");
		 buff.append("	emp ");
		 break;	
		 
		 case 1002:
			 buff.append("SELECT ");
			 buff.append("	empno eno, ename name, job, mgr, hiredate, sal, comm, deptno dno	");
			 buff.append("FROM ");
			 buff.append("	emp ");
			 buff.append("WHERE ");
			 buff.append("	empno = ? ");
			 break;		
		 }
		 
		 return buff.toString();		
	}
	
	public static void main(String[] args) {
		EmpSQL e = new EmpSQL();
	}
}

