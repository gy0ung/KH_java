package exception01;

public class _07_Throw {

	public static void main(String[] args) {
		try {
		Exception e = new Exception("고의로 예외 발생시킴");
		throw e;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 메시지 : " + e.getMessage());
			                                    // 위에 넣은 메시지가 출력됨
		}
		System.out.println("프로그램 정상 종료");
	}

}
