package polymorphism02;

class Parent {
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	// ↓ 오버라이딩 어노케이션 부모메서드에서 동일한 메서드가 있는지 찾아서 오류를 표시해줌 
	@Override
	void method2() {
		System.out.println("Parent-method2()를 오버라이딩");
	}
	void method4() {
		System.out.println("child-method4()");
	}
}

public class PolymorphismTest3 {
	public static void main(String[] args) {
		Child c1 = new Child(); // 자식타입 객체생성
		// 부모타입으로 형변환 했기 때문에 부모것만 쓸 수 있다.
		Parent p1 = c1; // == Parent p1 = new Child();
		p1.method1();
		// 오버라이딩을 한 경우 부모타입으로 형변환했어도 자식것이 호출된다.
		p1.method2(); 
//		p1.method3(); // 자식것은 호출 불가

	}
}
