package casting02;

public class Casting02 {

	public static void main(String[] args) {
		
//		           정수                     실수
//		 byte → short → int → long / → float → double
//				  char
//		 1바이트  2바이트   4바이트  8바이트   4바이트    8바이트
	
		
		// 강제(명시적) 타입변환 : Casting 캐스팅
		//                   큰 타입을 작은 타입단위로 타입변환
		//                   끝의 한 부분만 작은 타입으로 강제적 변환
		//                  * 값이 소실될 수 있기때문에 잘 확인하여 명시적 변환해야한다.
		
		
//		                작은 타입 = 큰 타입 
		
		int n1 = 120;
		byte b1 = (byte)n1; // 강제형변환 ()
		System.out.println(b1);
		
		n1 = 1234534;
		b1 = (byte)n1;
		System.out.println(b1);
		
		double d1 = 13627.28792838271;
		float f1 = (float)d1;
		System.out.println(f1);
		
		System.out.println("byte의 크기 : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("char의 크기 : " + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long의 크기 : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("float의 크기 : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("double의 크기 : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		
	}

}
