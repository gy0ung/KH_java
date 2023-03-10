package super07;

class Parent3 {
	int x;
	Parent3() {
		this.x = x;
		System.out.println("부모 생성자");
	}
}

class Child3 extends Parent3 {
	int x = 100;
	Child3() {
		System.out.println("자식 생성자");
	}
}

public class SuperTest4 {
	public static void main(String[] args) {
		Child3 ch3 = new Child3();
		
	}
}
