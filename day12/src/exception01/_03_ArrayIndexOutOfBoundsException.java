package exception01;

public class _03_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		try {
		str[1] = "d";
		str[6] = "e";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다 index는 2까지만 가능");
			System.out.println("오류 메시지 : " + e);
		}
		
		
	}

}
