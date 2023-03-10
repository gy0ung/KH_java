package exception01;

public class _08_MultiTryCatch {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		String[] strNum = {"23", "17", "3"};
		int i = 0; 
		
		try {
			str[1] = "d";
			str[2] = "e";
			
			for(i = 0; i<strNum.length; i++) {
				int x = Integer.parseInt(strNum[i]);
				System.out.println(x);
			}	
			int num = 9/0;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다.");
		}catch(NumberFormatException e) {
			System.out.println(strNum[i] + "정수로 변환할 수 없습니다..");
			
			// ArrayIndexOutOfBoundsException 와 NumberFormatException을
			// 제외한 나머지는 Exception만 넣어줘도 오류를 출력할수 있다.
		}catch(Exception e) { // 
			System.out.println(e.getMessage());
		} finally { // try,catch문과 상관없이 끝에 무조건 실행
		System.out.println("프로그램 종료");
		}
		System.out.println("프로그램 종료");
	}
}
