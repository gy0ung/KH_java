package objectMethod02;

class Op {
	// method(기능)
	void print1() {
		System.out.println("반환값이 없고 매개변수가 없는 메서드");
	}
	
	int print2() {
//		int result = 10;
		System.out.println("반환값이 정수형이고, 매개변수가 없는 메서드");
//		return result;
		return 100;
	}
	
	String print3() {
		System.out.println("반환값이 문자열이고, 매개변수가 없는 메서드");
		return "kh정보교육원";
	}
	
	boolean print4() {
		System.out.println("반환값이 boolean이고, 매개변수가 없는 메서드");
		return true;
	}
	
	// 매개변수가 있는 메소드
	void print5(int x) {       // 반환값이 없기때문에 return쓰면 오류남
							   // 반환값이 없으면 실행문으로 실행시 오류
		System.out.println("반환값이 없고, 매개변수가 정수 1개인 메서드");
		int result = x + 10;
		System.out.println(result); 
	}
	
	String print6(String name) {
		System.out.println("반환값이 문자열이고, 매개변수가 문자열 1개인 메서드");
		return name + "님 반갑습니다.";
	}
	
	int print7(int x, int y) {
		int result = x + y;
		return result;
	}
}

public class MethodTest01 {

	public static void main(String[] args) {
		Op op1 = new Op();
		op1.print1();
		op1.print2();
		System.out.println("==================");
		int result = op1.print2();
		System.out.println(result);
		System.out.println("==================");
		System.out.println(op1.print2());
		System.out.println(op1.print3());
		System.out.println(op1.print4());
		op1.print5(50);
		System.out.println(op1.print6("홍길동"));
		int re = op1.print7(5, 7);
		System.out.println(re);
		System.out.println(op1.print7(5, 10));
	}
}
