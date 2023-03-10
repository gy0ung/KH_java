package tv04;

public class Tv {
	boolean power;
	int channal;
	
	void power() {
		power = !power;
		// power는 boolean이기때문에 true아니면 false기때문에 if문에 power만 넣어서 가능
		if(power) { 
			System.out.println("전원을 켭니다.");
		}else {
			System.out.println("전원을 끕니다.");
		}
	}
	
	// void 기 때문에 리턴값이 없어서 따로 출력문을 입력해야 객체생성 후 호출했을때 출력된다.
	void channalUp() {
		++channal;
		System.out.println("현재 채널 : " + channal);
	}
	
	void channalDown() {
		--channal;
		System.out.println("현재 채널 : " + channal);
	}
	
}
