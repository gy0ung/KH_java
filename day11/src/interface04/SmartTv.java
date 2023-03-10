package interface04;

public interface SmartTv {
	void search(String search);

	// ↓ 뒤늦게 추가하는경우 오버라이딩을 하지않아도 실행됨
	default void internet(String url) { 
		System.out.println("나중에 추가한 default 메서드");
		System.out.println("인터넷 보기");
	}
	static void sInter() {
		System.out.println("kkkk");
	}
}
