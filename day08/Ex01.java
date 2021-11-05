package day08;

/*
 *  http://www.cnu.com/prof.cnu?id=euns&pw=1234&name=전은석&mail=euns_jun@naver.com
 *  위 문자열을 전달된 데이터만 분리해서 배열에 보관하시오
 */
import java.util.*;
public class Ex01 {
	public Ex01() {
		String str = "http://www.cnu.com/prof.cnu?id=euns&pw=1234&name=전은석&mail=euns_jun@naver.com";
		
		//버리는 부분 : http://www.cnu.com/prof.cnu?
		//남길 부분 : id=euns&pw=1234&name=전은석&mail=euns_jun@naver.com
		//남길 부분을 나누는 기호 : = (키값빼고 데이터만 남길 것) 
		
		StringTokenizer token = new StringTokenizer(str, "?");
		String result = "";
		while(token.hasMoreTokens()) {
			result = token.nextToken();
		}
		token = new StringTokenizer(result, "&");
		String[] data = new String [token.countTokens()];
		String[] key = new String [token.countTokens()];
		int i = 0;
		while(token.hasMoreTokens()) {
			int j = 0;
			String tmp = token.nextToken();
			StringTokenizer t1 = new StringTokenizer(tmp, "=");
			while(t1.hasMoreTokens()) {
				if(j++ == 0) {
				key[i] = t1.nextToken(); 
				}else {
					data[i] = t1.nextToken();
				}
			}	
			i++;
		}
		System.out.println("key : " + Arrays.toString(key)); 
		System.out.println("value : " + Arrays.toString(data)); 
	}
	
	
		
	public static void main(String[] args) {
		new Ex01();
	}

}
