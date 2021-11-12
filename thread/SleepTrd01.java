package thread;

public class SleepTrd01 implements Runnable {
	private boolean bool = false;
	
	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++) {
			if(bool) {
				break;
			}
			System.out.println("김독자가 몰래 토마토를 버립니다" + i);
			/*
			 한번 출력하면 비록 시간이 남아있더라도 아예 블럭상태로 보낼것
			 유쭝이 잡아감.. 우.. 
			 */
			try {
				//러너블 상태로 복귀할 시간을 정해주고 명령을 내린다	> 어차피 되살아나니까 괜찮음..
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();{}
			}
		}
	}

}
