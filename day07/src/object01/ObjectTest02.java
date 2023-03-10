package object01;

// 메소드클래스에 같이 라이브러리를 넣으면 같은 패키지안에서만 사용이 가능 (public을 붙일수없기때문)
// 라이브러리클래스는 되도록이면 한곳에 넣지말고 따로따로 생성하는것을 권장.

class Kh {
	String addr = "서울";
	int tel = 02-1234-1234;
}

class Student {
	String name ="홍길동";
	boolean gender = true;
}

// public은 반드시 한 클래스에만 붙일수있다. (여러곳에 붙이면 오류발생)
public class ObjectTest02 {

	public static void main(String[] args) {
		
		Kh kh1 = new Kh();
		
		Student st = new Student();
		
		Car02 car = new Car02();
		
	}

}
