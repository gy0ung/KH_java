package variable01;

public class Operator {
	int num1 = 1;
	int num2 = 1;
	
	int add(int num1) {
		this.num1 = num1; // this. ← 현재객체를 의미 / num1 = 1; 의 num1을 가르킴
		this.num2 = num2;
		return this.num1 + num2;
	}
	int subtract(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return num1 + num2;
	}
}


// 지역변수는 기본값이 없다 int a; 가 안됨
// 클래스변수는 기본값이 있다 int a; 가능