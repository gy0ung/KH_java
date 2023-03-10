package day02;

public class Char01 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65; // 아스키코드표의 번호 65 = A 
		char c3 = '\u0041'; // 유니코드를 의미하기로 약속 \u0041 = 유니코드 0041 = A
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("-----");
		
		char c4 = '가';
		char c5 = 44032; // 아스키코드표의 번호
		char c6 = '\uac00'; // 유니코드번호 ac00 = 가
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("-----");
		
		// 유니코드를 알고싶을땐 int형으로 출력
		int unicode = '정';
		System.out.println(unicode);
		System.out.println("-----");

		char c7 = 'a' + 1; // 아스키코드표 a는 97이므로 +1을 하여 98 즉 , b로 출력됨
						   // 리터럴에서는 연산을 반영하여 사용가능하다.
		System.out.println(c7);
		System.out.println("-----");
		
//		char c8 = c7 + 1; // char형에 연산반영하면 오류 / 바이트가 큰수로 자동형변환되어 오류발생
//		char c8 = char c7 + int 1 // 위의 식을 풀어서 작성하면 해당 식이 나오므로 오류가 발생한다.
		
		// 오류가 발생하진않지만 출력이 되지않음
		char c8 = 'A' + 'B';
		System.out.println(c8);
		// char가 아닌 int형으로 바꿔주면 출력됨
		int c9 = 'A' + 'B';
		System.out.println(c9);
		
	}

}
