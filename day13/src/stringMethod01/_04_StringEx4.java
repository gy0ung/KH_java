package stringMethod01;

public class _04_StringEx4 {

	public static void main(String[] args) {
		String ssn = "2938505968487";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 아닙니다.");
		}
		
	}

}
