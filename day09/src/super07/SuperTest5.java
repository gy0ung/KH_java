package super07;

class Parent01 {
	int x;
	Parent01(int x) { // 생성자가 먼저 호출되고 그다음 인스턴스변수
		this.x = x*x; 
		System.out.println("a의 제곱 : " + this.x); 
	}
}

class Child01 extends Parent01 {
	int y;
	Child01(int a, int b) {
		super(a); // Parent01(int x) 에 a값이 입력됨
		y = b*b; 
		System.out.println("b의 제곱 : " + y);
	}
}

public class SuperTest5 {
	public static void main(String[] args) {
		Child01 ch3 = new Child01(3,7);
		System.out.println(ch3.x);
		
	}
}
