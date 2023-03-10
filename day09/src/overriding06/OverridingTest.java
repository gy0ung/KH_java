
//override : ~위에 덮어쓰다, ~에 우선하다.
//오버라이딩 : 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게
//			 변경하는것을 오버라이딩 이라고 한다.
//        무조건 자손께 먼저 실행이된다!!!

//오버라이딩 조건 : 1. 선언부가 같아야한다. (이름, 매개변수, 리턴타입) → 매개변수가 다른건 오버로딩
//				 한 클래스에 같은건 오버라이딩이 아닌 오류이다. (부모와 자식클래스에서 같아야함)
//오버로딩 : 기존에 없는 새로운 메서드를 정의 하는것 (new)
//			이름만 같은 뿐 선언부는 다다르다.

package overriding06;

// 아래두개는 오버라이딩
class Ea {
	void print() {
		System.out.println("부모 클래스의 print()메서드");
	}
}

class Eb extends Ea {
	void print() {
		System.out.println("자식 클래스의 print()메서드");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Eb eb = new Eb();
		eb.print(); // 자식클래스로 객체를 생성하여 자식클래스의 메서드가 우선
	}
}
