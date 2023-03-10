package phone05;

public class SmartPhone extends CellPhone {
	String katalk;
	String seach;
	
	public void katalk(String katalk) {
		System.out.println(katalk + "라고 카톡을 전송합니다.");
	}
	
	void seach(String seach) {
		System.out.println("인터넷에서 " + seach + "를 검색합니다.");
	}

}
