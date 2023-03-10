package stringMethod01;

public class _10_StringEx10 {

	public static void main(String[] args) {
		// equalsIgnoreCase() : 대소문자 구분없이 문자가 같은지 비교
		String str1 = "java";
		String str2 = "JAVA";	
		
		System.out.println(str1.equals(str2)); // 대소문자를 가림
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 안가림
	}

}
