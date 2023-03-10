package product04;

public class Audio extends Product {
	Audio() {
		super(20);
	}
	
	// toString은 최고조상(부모)인 Object클래스에 들어있다. 
	// toString을 메서드로 호출하면 클래스이름에다 주소이름이 나온다.
	// 오버라이딩할때 부모의 메서드보다 접근제어범위가 넓어야한다.
	@Override
	public String toString() {
		return "Audio";
	}
}
