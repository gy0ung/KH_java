package abstract01;

public class Cat extends Animal {
	Cat() {
		kind = "포유류";
	}
	
	// 꼭 오버라이드라고 하지않아도 오류는 나지않는다. (원형만 같으면)
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
