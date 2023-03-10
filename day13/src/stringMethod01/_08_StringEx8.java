package stringMethod01;

public class _08_StringEx8 {

	public static void main(String[] args) {
		// toLowerCase() : 모든 문자를 소문자로 변환
		// toUpperCase() : 모든 문자를 대문자로 변환

		String str1 = "JAVA Program";
		String strLower = str1.toLowerCase();
		System.out.println(str1);
		System.out.println(strLower);
		
		String strUpper = str1.toUpperCase();
		System.out.println(strUpper);
		
		String str2 = strLower.substring(0,1).toUpperCase() + strLower.substring(1,5)
		+ strLower.substring(5, 6).toUpperCase() + strLower.substring(6); 
		System.out.println(str2);
	}

}
