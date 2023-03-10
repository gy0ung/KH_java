package print01;

public class Print01 {

	public static void main(String[] args) {
		// 출력시 문자열은 " " 안에 넣는다.
		//      숫자열은 " " 가 들어가면 안된다. (연산 불가능)
		
		System.out.println("문자열 출력시 쌍따옴표");
		System.out.println(789812); // 숫자라서 연산가능
		System.out.println("789812"); // 문자열이라서 연산불가능
		
		System.out.println(10+20); // 연산식으로 반영됨
		System.out.println("10+20"); // 문자로 반영됨
		System.out.println("10"+"20"); 
		
		System.out.println(12.345+5.345);
		
		// 사칙연산
		System.out.println(20+10);
		System.out.println(20-10);
		System.out.println(20*10);
		System.out.println(20/10);
		
	}

}
