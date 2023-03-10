package stringMethod01;

public class _02_StringEx2 {

	public static void main(String[] args) {
		// charAt(index) : index번호에 해당하는 문자 1개 반환
		String str = "123456-1234567";
		char ch1 = str.charAt(7); // 인덱스번호는 0번부터 시작하며 -도 포함하여 카운트
		
		switch(ch1) {
		case '1' : case '3' :
			System.out.println("남자");
			break;
		case '2' : case '4' :
			System.out.println("여자");
			break;
		}
	}

}
