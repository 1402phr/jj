package thread;

public class SleepTrd02 implements Runnable {
	private boolean bool = false;
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++) {
			if(bool) {	//if(bool) = if(bool == true)
				break;
			}
			System.out.println("\t" + i + "\t유중혁이 토마토를 버린 김독자를 잡아갑니다");
			/*
			 한번 출력하면 비록 시간이 남아있더라도 아예 블럭상태로 보낼것
			 유쭝이 잡아감.. 우.. 
			 */
			try {
				//러너블 상태로 복귀할 시간을 정해주고 명령을 내린다 	> 얘도 회귀하니까 블럭시켜도 괜찮음..
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();{}
			}
		}
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}

}
