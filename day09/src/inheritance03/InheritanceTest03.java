package inheritance03;

class D {
	static int i;
	static int j;
}

class E extends D {
	static String i;
}

// 클래스 앞에 public은 한클래스에만 가능
public class InheritanceTest03 {
	public static void main(String[] args) {
		// static이 붙은건 객체생성을 하지않아도 사용이 가능하다.
		// 클래스 이름으로 지정을 할수있기때문에 같은명의 변수에 다른타입이어도 오류가 발생하지않는다.
		D.i = 100;
		E.i = "KH정보교육원";
		D.j = 500;
	}

}
