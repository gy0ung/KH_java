package stringMethod01;

import java.util.StringTokenizer;

public class _12_StringEx12 {

	public static void main(String[] args) {
		// 2. StringTokenizer클래스
		//			countTokens() : 남아있는 토큰 수
		//			hasMoreTokens() : 남아있는 토큰이 있는지 여부
		//			nextToken() : 토큰을 하나씩 꺼내온다
		
		String text = "홍길동-아무개-이순신-강감찬";
		StringTokenizer st = new StringTokenizer(text, "-");
		int count = st.countTokens();
		System.out.println("남아있는 토큰 수 : " + count);
		for(int i = 0; i<count; i++) {
			String name = st.nextToken();
			System.out.println(name);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
