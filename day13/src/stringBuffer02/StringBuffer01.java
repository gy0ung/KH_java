package stringBuffer02;

public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		// equals()를 오버라이딩 하지 않았음 : 주소가 같은가를 물어봄
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2) );
		
		// sb2 = sb1 + "def"; 오류
		// append() 사용
		sb1.append("def");
		System.out.println("sb1 : " + sb1);
		sb1.append("... 알파벳");
		System.out.println("sb1 : " + sb1);
		sb1.append("def... 알파벳");
		
		// 문자열이 같은가를 비교할 때
		String str = sb1.toString();
//		           = new String(sb1); 와 같다
		String str2 = sb2.toString();
		System.out.println(str.equals(str2));
	}

}
