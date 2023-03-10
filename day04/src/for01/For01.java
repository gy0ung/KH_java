package for01;

public class For01 {

	public static void main(String[] args) {
		// 반복문 : 여러번 반복하여 수행하고자 할때
		System.out.println("안녕하세요, KH정보교육원 입니다.");
		System.out.println("안녕하세요, KH정보교육원 입니다.");
		System.out.println("안녕하세요, KH정보교육원 입니다.");
		System.out.println("안녕하세요, KH정보교육원 입니다.");
		System.out.println("안녕하세요, KH정보교육원 입니다.");
		
		System.out.println("=============================실행문반복");
		
		String s = "안녕하세요, KH정보교육원 입니다.";
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);

		System.out.println("=============================변수반복");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요, KH정보교육원 입니다.");
		}

		System.out.println("=============================for문반복");
		
		for(int i1 = 1; i1 <= 100; i1++) {
			System.out.println(s);
		}
		System.out.println("=============================for문 변수반복");
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + ". 안녕하세요, KH정보교육원 입니다.");
		}
		
		
	}

}
