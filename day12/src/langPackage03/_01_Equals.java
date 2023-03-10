package langPackage03;

public class _01_Equals {

	public static void main(String[] args) {
		String str = "a";
		String str2 = "a";
		System.out.println("str과 str2의 주소가 같은가 ? " + (str == str2));
		
		// 객체를 생성하면서 "a"를 넣음
		String str3 = new String("a");
		String str4 = new String("a");
		System.out.println("str3과 str4의 주소가 같은가 ? " + (str3 == str4));
		
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		System.out.println("v1과 v2의 주소가 같은가 ? " + (v1 == v2));
		
		System.out.println("----------------------------------");
		
		// String에서는 equals를 오버라이딩 했기 때문에 값 비교가능
		if(str.equals(str2)) {
			System.out.println("str과 str2의 값이 같다");
		}else {
			System.out.println("str과 str2의 값이 다르다");
		}
		
		// java.lang에 있는 equals()메소드는 주소가 같은가?를 비교함
		if(v1.equals(v2)) {
			System.out.println("str과 str2의 값이 같다");
		}else {
			System.out.println("str과 str2의 값이 다르다");
		}
		
	}

}
