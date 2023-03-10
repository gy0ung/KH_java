package varargs05;

public class VarargsTest {

	public static void main(String[] args) {
		int[] a = { 100, 200, 300, 400, 500 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for (int b : a) {
			System.out.println(b);
		}

		System.out.println(con("a", "b", "c", "d", "e"));
		System.out.println("----------------");
		System.out.println(con2("-","a", "b", "c", "d", "e"));
	}

	static String con(String... str) { // 인자가 0~개 무한대 
		                               // 1개여도되고 10개여도되고 100개여도됨
		String result = "";
		for (String arst : str) {
			result += arst + " ";
		}
		return result;
	}
						// 인자가 1개이상 들어와야한다.
	static String con2(String format1, String... str) { // 무조건 1개는 입력해야함
		String result = "";
		for (String arst : str) {
			result += arst + format1;
		}
		return result;
	}
	
	// 지역변수 : 메서드,반복문,조건문 안에서 선언
	// 인스턴스변수 : 클래스 바로 아래 선언. 객체를 생성했을때 저장공간이 생김
	// 클래스변수 : 클래스 바로 아래 static붙여 선언. (클래스이름.변수명) 호출
	// 			 클래스로 생성되는 모든 객체에서 공동으로 사용
	// 			 객체를 생성하지 않고 사용가능
	
	// 인스턴스 메서드 : 객체를 생성해야만 사용가능
	// 클래스 메서드 : 메서드 앞에 static을 붙여 선언. (클래스이름.메서드명) 호출
	
	// 배열일때 향상된for문 사용 : for(자료형 변수명:배열명) → 처음부터 배열끝까지 
	//                                                모두 돌면서 실행
	//   int[] num = {1,2,3,4,5}  →   ex) for(int num1 : num) 
	
	// 오버로딩 : 메서드의 이름은 동일하고, 매개변수 갯수나 자료형이 다르게 생성
	//          똑같은 이름을 사용하기때문에 사용자가 편리하게 사용할수있다. 
	//          (팀단위 등 여러사람이 함께 작업할때 용이)
	
	// 가변인자 : 매개변수의 갯수가 몇개가 될지 모를때 사용
	//          void play(int a, String b); → 매개변수
	//               play(3,"홍길동"); → 인자
	//          void play(String...str); → 0개~무한개
	//          void play(int a, String...aa); → 1개는 꼭 필수로 입력해야함.
	//                                            꼭 무한대앞에 들어와야지 입력가능
	
	// 생성자 : 객체가 생성될 때 반드시 1번 호출(정의하지 않으면 빈 생성자를 
	//                                   컴파일러가 자동으로 넣어 컴파일함)
	//         변수 초기화 할때 많이 사용 (객체를 생성할 때 반드시 실행할 일이 있다든지)
	// 생성자 오버로딩 : 매개변수를 다르게 여러개의 생성자 선언가능
	//                생성자 안에서 다른 생성자 호출가능(반드시 첫줄에 this() 로 호출)
	
	
}
