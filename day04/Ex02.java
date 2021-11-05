package day04;

public class Ex02 {
	/*
		알파벳 5개를 랜덤으로 추출해서 배열에 기억시켜라
		단, 중복문자는 없어야한다
	 */

	public static void main(String[] args) {
		//1. 기억시킬 배열을 만든다
		//char? int?
		char[] word = new char[5];
		
		//2.알파벳 5개를 추출한다
		loop:
		for(int i = 0 ; i < 5 ; i++) {
			char ch = (char)(Math.random() * ('z' - 'a' + 1) +'a');
		
		//3. 중복확인해서 중복이면 재실행
			for(int j = 0 ; j < i-1 ; j++) {
				if(ch == word[j]) {
					i--;
					continue loop;
				}
			}
		//4. 중복이 아니면 기억
			word[i] = ch;
			}
		
		//5. 출력
		for(char ch : word) {
			System.out.println(ch);
		}
		System.out.println();
		
		System.out.println(new String(word));
		

	}

}


//5. 출력