package string03;

public class String02 {

	public static void main(String[] args) {
		// String(참조자료형)을 기본자료형(Byte, Short, Integer)으로 변환
		String str = "30";
		int num = Integer.parseInt(str);
		
		System.out.println(num + 10); // 숫자형이라 연산된 값이 출력
		System.out.println(str + 10); // 문자열이기때문에 연결된 값이 출력
		
		byte b = Byte.parseByte(str);
		System.out.println(b);
		
		String str2 = "15.678";
		double d1 = Double.parseDouble(str2);
		System.out.println(str2);
		System.out.println(str2+10);
		System.out.println(d1+10);
		
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(str3);
		System.out.println(bool);
		
		// 기본자료형을 String(참조자료형)으로 바꿀때
		int num2 = 50;
		String str4 = String.valueOf(num2);
		System.out.println(str4 + 100);
		
	}

}
