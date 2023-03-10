package stringMethod01;

public class _07_StringEx7 {

	public static void main(String[] args) {
		// contains(문자열) : 문자열이 포함되어 있으면 true반환
		
		String str = "java program.txt";
		boolean bool = str.contains("va");
		System.out.println(bool);
		
		// endsWith(문자열) : 문자열로 끝나는지 검색
		bool = str.endsWith(".png");
		System.out.println(bool);
		
		if(bool) {
			System.out.println("그림파일 입니다.");
		}else {
			System.out.println("그림파일이 아닙니다.");
		}
	}

}
