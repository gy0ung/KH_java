package super07;

class ParentA {
	int x = 10;
	void show() {
		System.out.println("부모클래스 show() 메서드");
	}
}

class ChildA extends ParentA {
	int x = 100;
	void show() {
		System.out.println("자식클래스 show() 메서드");
	}
	void write() {
		int x = 500;
		show(); // 자식클래스가 우선순위므로 자식클래스가 호출
		super.show(); // 부모에 있는 show() 메서드 호출
		System.out.println("지역변수 x변수 : " + x); 
		System.out.println("ChildA의 x변수 : " + this.x); 
		System.out.println("ParentA의 x변수 : " + super.x);
												// 바로 부모클래스에 있는 x 호출
	}
}

public class SuperTest2 {
	public static void main(String[] args) {
		ChildA ch = new ChildA();
		ch.write();
		
	}
}
