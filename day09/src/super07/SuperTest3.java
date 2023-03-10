package super07;

class Parent2 {
	int x=1;
	Parent2(int x) {
		this.x = x;
		System.out.println("부모 생성자");
	}
}

class Child2 extends Parent2 {
	int x = 100;
	Child2() {
		// super는 부모의 생성자를 의미
		super(5); // 인자가 있는 경우 반드시 넣어줘야함
		System.out.println("자식 생성자");
	}
	void superx() {
		System.out.println(super.x);
	}
}

public class SuperTest3 {
	public static void main(String[] args) {
		Parent2 p = new Parent2(8);
		System.out.println();
		Child2 ch2 = new Child2();
		
	}
}

// 부모클래스
// 생성자 (매개변수 int형 1개) {
//			매개변수의 값의 3제곱을 하여 인스턴스 변수에 저장
// }

// 자식클래스
// 변수 1개
// 생성자 (int a, int b) {
//			매개변수의 값의 b의 제곱을 하여 인스턴스 변수에 저장
// }