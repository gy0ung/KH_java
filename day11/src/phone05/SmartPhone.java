package phone05;

public class SmartPhone extends Phone {
	String katalk;
	String seach;
	
	public void katalk(String katalk) {
		System.out.println(katalk + "라고 카톡을 전송합니다.");
	}
	
	void seach(String seach) {
		System.out.println("인터넷에서 " + seach + "를 검색합니다.");
	}

	@Override
	void bell() {
		System.out.println("따르르르르릉");
	}

	@Override
	void pickUp() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	void hangUp() {
		System.out.println("전화를 끊습니다.");
		
	}

}
