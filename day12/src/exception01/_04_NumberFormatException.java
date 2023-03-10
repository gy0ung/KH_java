package exception01;

public class _04_NumberFormatException {

	public static void main(String[] args) {
		String[] strNum = {"23", "17", "3.141592"};
		
//		 ▼ 기본자료형 → 기본자료형을 이렇게 바꾸지만, 객체형일때는 안된다.
//		int x = (int)strNum[0];  
		
//		 ▼ 객체를 속 기본자료형을 변경할때는 Integer.paㄱse(변수)을 이용한다.
		int x = Integer.parseInt(strNum[0]);
		System.out.println(x);
		
		System.out.println("=================");
		int i = 0; // 지역변수가 아닌 인스턴스변수기 때문에  catch에서 사용할 수 있다.
		try {
			for(i = 0; i<strNum.length; i++) {
				int y = Integer.parseInt(strNum[i]);
				System.out.println(y);
			}
		} catch(NumberFormatException e) {
			System.out.println(strNum[i] + "는 정수로 변환할 수 없습니다.");
			System.out.println("메세지 : " + e);
		}
	}

}
