package varialbe02;

public class Variable01 {

	public static void main(String[] args) {
		// 정수
		int number;
		number = 25; // = 대입연산자 (오른쪽에 있는걸 왼쪽으로 넣음) 25를 number에 넣음
		
		int number2 = 30;
		
		System.out.println(number+number2);
		
		int result = number + number2;
		System.out.println(result);
		System.out.println(result*3);
		System.out.println(result/5);
		System.out.println(result*number);
		System.out.println("-----------");
		
		number = 100;
		number2 = 200;
		System.out.println(number);
		System.out.println(number2);
		System.out.println(result); // 기존에 반영된 number,number2의 값으로 반영됨
		
		int result2 = number + number2;
		System.out.println(result2);
		
	}

}
