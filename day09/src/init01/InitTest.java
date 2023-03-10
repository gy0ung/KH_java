package init01;

public class InitTest {

	public static void main(String[] args) {
		Init in = new Init();
		
		System.out.println();
		                        // 인스턴스변수기 때문에 객체명을 앞에 붙여줘야한다.
		System.out.println("인스턴스 변수 num = " + in.num); 
		                        // 클래스변수기 때문에 클래스이름을 앞에 붙여줘야한다.
		System.out.println("클래스 변수 sNum = " + Init.sNum); 
	}

}
