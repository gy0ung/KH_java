package day02;

public class Constant02 {

	public static void main(String[] args) {
		int max = 30; // max는 변수
		max = 40; // 다른값을 넣어도 오류가 발생하지않음 값변경가능.
		
		// 상수: 맨처음 값을 넣으면 변경 할 수 없는 값.
		//      앞에 fianl을 붙인다.
		//      변수명은 대문자로 하는것이 관례
		final int MAXX = 30; // MAXX는 상수 
//		MAXX = 40; // 다른값을 넣으면 오류발생 . 값 변경불가능 
		final double PI = 3.141519;
			
	}

}
