package super07;

class Parent1 {
	int x = 1;
}

class Parent extends Parent1 {
	int y = 10;
}

class Child extends Parent {
	int x = 100;
	void method() {
		int x = 1000; 
		// ↓ 제일먼저 {} 안에 있는 지역변수확인 / 그 다음 인스턴스변수확인 / 그 다음 부모변수확인
		System.out.println("x = " + x); // (지역변수가 있으므로) 지역변수인 1000
		System.out.println("this.x = " + this.x); // 클래스변수부터 확인 100
												  // 자식 클래스변수에 없으면 부모클래스
		System.out.println("super.x = " + super.x); // 바로 다음 부모클래스부터 확인 10
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();	
		c.method();
	}

}
