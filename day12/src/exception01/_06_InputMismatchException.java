package exception01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_InputMismatchException {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		Scanner scan = new Scanner(System.in);
		System.out.println("■ 정수 3개 입력");
		int sum = 0;
		for(int i=1; i<=3; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			try { // for문안에 넣으면 오류난부분 제외 후 계속 반복문실행
			int num = scan.nextInt();
			// scan.nextInt는 토큰개념이다.
			// scan.nextInt는 사용자가 입력한 int형을 입력받고 다음입력시 삭제 후 입력
			// 그러나 int형(자료형이 다른경우) 삭제되지않고 남아있는 상태가 됨
			// 하기의 오류가 난 경우 int형이 아닌 Exception이 발생되어 입력됨으로 
			// 삭제되지않고 가지고있게되어 다시 입력할수 없다. (3번째 입력문에 자동입력됨)
			sum += num;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				e.printStackTrace(); // 어떤오류가 발생했는지 출력됨
				// ↑ 주로 사용자보다는 개발자가 보기위해 출력함 
				// ↓ 오류메시지만 출력 (정확하지않아서 오류를 알기불편함)
				System.out.println("예외메시지 : " + e.getMessage());
				scan.next(); // 이걸 넣어줘야 오류 발생으로 Exception이 들어가져있는
				             // 부분을 버리고 다음으로 넘어가, 3번째 입력문입력이 가능
				--i;
			}
		}
		System.out.println("합 = " + sum);
	}
}