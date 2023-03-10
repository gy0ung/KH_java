package if01;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// Q2) 사용자로부터 영문자 혹은 숫자를 입력받아, 영문자면 문자입니다. 숫자이면 숫자입니다.
		//      영문자는 대소문자 상관없이 1글자만 숫자는 0~9 까지만 입력가능.
		Scanner s1 = new Scanner(System.in);
		System.out.print("영문자(대소문자 중 1개) 혹은 숫자(0~9) 1글자만 입력하시오 : ");
		String st1 = s1.next(); // 기본자료형이 아닌 객체라서 주소로 들어가기때문에 
		char c1 = st1.charAt(0); // charAt을 이용하여 추출해야함. 인덱스
		
		if('0' <= c1 && '9' >= c1)
			System.out.println("숫자입니다.");
		if('a' <= c1 && 'z' >= c1)
			System.out.println("문자이며 소문자입니다.");
		if('A' <= c1 && 'Z' >= c1)
			System.out.println("문자이며 대문자입니다.");
		
		
		
		
		
		
		
		
	}

}
