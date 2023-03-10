package phone05;

public class CellPhone extends Phone{
	String txt;
	String mv;
	
	void txt(String txt) {
		System.out.println(txt + "라고 문자를 전송합니다.");
	}
	
	void mv(String mv) {
		System.out.println("동영상 " + mv + "를 재생합니다.");
	}

	@Override
	void bell() {
		System.out.println("따릉따릉");
		
	}

	@Override
	void pickUp() {
		System.out.println("전화를받다");
	}

	@Override
	void hangUp() {
		System.out.println("전화를끊다");
	}
}
