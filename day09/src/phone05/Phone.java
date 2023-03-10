package phone05;

public class Phone {
	boolean power;
	boolean call=true;
	String tel;
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("전원을 켭니다.");
		}else {
			System.out.println("전원을 끕니다.");
		}
	}
	
	void call(boolean call) {
		this.call = call;
		if(call) {
			System.out.println("전화를 받습니다.");
		}else {
			System.out.println("전화를 끊습니다.");
		}
	}
	
	void tel(String tel) {
		this.tel = tel;
		System.out.println("전화번호 " + tel + "로 전화를 겁니다.");
	}
	
}
