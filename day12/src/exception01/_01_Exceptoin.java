package exception01;

public class _01_Exceptoin {

	public static void main(String[] args) {
	/*	int result = 5/0;
		System.out.println(result); */
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			// 예외가 발생할 상황
			int result = 5/3;
//			System.out.println(result);
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {
			// 예외가 발생했을때 처리할것을 작성
			// ↓ 예외가 발생했을때 실행
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println(5);
		}
		
//		System.out.println("kh정보교육원");
		System.out.println(6);
		
	}

}
