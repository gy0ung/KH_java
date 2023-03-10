package casting02;

public class OperCasting03 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 30;
		
//		byte b3 = b1 + b2; // int형보다 작은 연산은 자동으로 int형으로 형변환되기때문에 오류발생
		int i1 = b1 + b2;
		byte b3 = (byte)(b1+b2); // byte로 값을 출력하고 싶으면 byte로 강제 형변환을 해주어야함 (명시적 형변환)

		short s1 = 34;
		short s2 = 54;
		
		int i2 = s2-s1;
		int i3 = s1*b1;
		
		char c1 = '&'; // 유니코드에 특수기호값도 있음.
		int cc1 = '&'; // int형으로 값 확인
		char c2 = 'a'+3; // d
		int cc2 = 'a'+3; // int형으로 값 확인
		
//		char c3 = c1 +c2; // int로 형변환되기때문에 오류
		int i4 = c1+c2;
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(i4);
		
		long long1 = 1234L; // long 은 꼭 L을 붙여주지않으면 int형으로 자동변환됨. *주의*
//		int i5 = long1 * i4; // int < long 이기 때문에 오류발생
		long long2 = long1 * i4; // long으로 변수설정
	
		float f1 = 3.15f; // float는 꼭 f를 붙여주지않으면 double형으로 자동변환됨. *주의*
		float f2 = (float)3.15;
		float f3 = f1+i4;
		
		char c4 = 'a';
//		char c5 = c4 + 10; // 연산하면 int로 형변환되기때문에 오류발생
		char c6 = (char)(c4+10);
		System.out.println(c6);
		
		
		
	}

}
