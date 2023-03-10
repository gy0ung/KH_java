package stringMethod01;

public class _09_StringEx9 {

	public static void main(String[] args) {
		// trim() : 앞과 뒤의 공백 제거 (가운데 들어가있는 공백은 제거하지않는다)
		String str1 = "java     ";
		
		System.out.println(str1 + "공백제거 전");
		System.out.println(str1.trim() + "공백제거 후");
		
		String str2 = "   program   ";
		String str3 = "   입문";
		
		System.out.println(str1.trim() + str2.trim() + str3.trim());
		
		// 중간의 공백들은 그대로 유지
		String str4 = "   java  program 입문   ";
		System.out.println(str4.trim()+":공백제거");
	}

}
