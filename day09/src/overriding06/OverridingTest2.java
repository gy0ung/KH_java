
//override : ~위에 덮어쓰다, ~에 우선하다.
//오버라이딩 : 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게
//			 변경하는것을 오버라이딩 이라고 한다.
//        무조건 자손께 먼저 실행이된다!!!

//오버라이딩 조건 : 1. 선언부가 같아야한다. (이름, 매개변수, 리턴타입) → 매개변수가 다른건 오버로딩
//				 한 클래스에 같은건 오버라이딩이 아닌 오류이다. (부모와 자식클래스에서 같아야함)
//오버로딩 : 기존에 없는 새로운 메서드를 정의 하는것 (new)
//			이름만 같은 뿐 선언부는 다다르다.

package overriding06;

class Oa {
	void show() {
		System.out.println("부모 show()메서드");
	}
}

//오버로딩
class Ob extends Oa {
	void show(String name) {
		System.out.println("자식 show()메서드 " + name);
	}
	void show(int a) {
		System.out.println("자식 show()메서드 " + a);
	}
}

public class OverridingTest2 {
	public static void main(String[] args) {
		Ob ob = new Ob();
		ob.show(); // 매개변수가 없는 부모클래스의 show메서드 출력
		ob.show("인자1개"); // 매개변수가 있는 자식클래스의 show메서드 출력
		ob.show(1); // 매개변수가 있는 자식클래스의 show메서드 출력
		
		
		
	}

}
