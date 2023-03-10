package abstract01;

// 추상메서드가 하나라도 들어가면 추상클래스로 작성해주어야한다.
// public 앞에 뒤에 위치는 상관없다.
public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	abstract void sound();
}
