package casting02;

public class Promotion01 {

	public static void main(String[] args) {
		int n1 = 1234567890;
		int n2 = 1234567890;
		
//		           정수                     실수
//		 byte → short → int → long / → float → double
//				  char
//		 1바이트  2바이트   4바이트  8바이트   4바이트    8바이트
	
		
		// 자동형 변환 : 작은타입 → 큰 타입에 대입할때, 자동으로 형이 변환되어 들어간다.
		float n3 = n2; // 묵시적 형변환
		long n4 = n1;
		
		// 값이 넘어서면 이상한 값이 나온다.
		int result = n1 * n2; // int형 보다 
		System.out.println(result);
		
		byte b1 = 40;
		short s1 = b1;
		
		char c1 = 78;
		char c2 = 'H';
		int n5 = c1;
		int n6 = c2;
		n5 = b1;
		n5 =s1;
		
//		byte b1 = n1;  // 큰 값을 작은 값으로 대입하려고 하면 값이 잘려 오류발생 
//	     1byte   4byte 
		
	}

}
