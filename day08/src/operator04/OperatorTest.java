package operator04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OperatorTest {
	int b = 10; // 인스턴스 변수(객체생성을 해야만 사용가능)
	static int c = 20; // 클래스 변수

	public static void main(String[] args) {
		int a = 30; // 지역변수
		Operator op1 = new Operator();
		System.out.println(op1.add(9.0,8.5)); // double add(double num1, double num2)
		System.out.println(op1.add(9.7)); // double add(double num1)
		System.out.println(op1.add(5,4)); // int add(int num1, int num2)
		System.out.println(op1.add()); // int add() 
		
		System.out.println("==========");
		System.out.println(op1.num()); // 1+1 = 2 int
		System.out.println(op1.num(3)); // 3-1 = 2 int 
		System.out.println(op1.num(3, 4)); // 3*4 = 12 int 
		System.out.println(op1.num(3.0)); // 3.0/1 = 3.0 double
		System.out.println(op1.num(3.0, 4)); // 3.0%4 = 3.0 double
		
		System.out.println("==========");
		int[] arr = {3, 8, 19, 38, 100, 293, 489};
		int arr2[] = new int[100];
		int value = 0;
		for(int i=0; i<arr2.length;i++) {
			value += 3;
			arr2[i] = value;
		}
		System.out.println(op1.add(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(op1.add(arr2));
		System.out.println("클래스 메서드 호출 : " + msg());
		System.out.println("클래스 변수 c의 값 : " + c);
		OperatorTest ot = new OperatorTest();
		System.out.println("인스턴스 변수 b의 값 : " + ot.b);
		System.out.println("인스턴스 메서드 호출 : " + ot.sum2(op1.num1));
	}
	static String msg() {
		return "안녕";
	}
	int sum2(int a) {
		return a+100;
	}
}
