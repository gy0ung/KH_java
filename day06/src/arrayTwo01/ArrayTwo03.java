package arrayTwo01;

import java.util.Scanner;

public class ArrayTwo03 {

	public static void main(String[] args) {
		// 2행 3열 배열 / 생성 6번 입력받기
		// 사용자로부터 점수를 입력받아 넣기
		// 사람별로 평균 70점 이상이면 합격 / 그렇지 않으면 불합격
		// 평균 ??.?입니다. 합격입니다!
		// 평균 ??.?입니다. 불합격입니다!
		
		int[][] score = new int[2][3];
		String[] name = {"홍길동","아무개"};
		String[] obj = {"국어","수학","영어"};
		Scanner scan = new Scanner(System.in);
		
			for(int i=0; i<score.length;i++) {
				int sum=0;
				for(int j=0; j<score[i].length;j++) {
			System.out.print(name[i]+"의 " + obj[j] + " 점수를 입력하세요 : ");
			score[i][j] = scan.nextInt();
			sum+=score[i][j];
				}
				System.out.println("총점 : " + sum + "점 입니다.");
				double avg = (double)sum/3;
				if(avg >=70 ) {
					System.out.printf("%s의 평균 : %.1f점 입니다. 합격입니다!", name[i],avg);
					System.out.println();
				}else
					System.out.printf("%s의 평균 : %.1f점 입니다. 불합격입니다!",name[i], avg);
					System.out.println();
			}
	
	}
}


/*
int[][] score = new int[2][3];

int[0][0] int[0][1] int[0][2]
int[1][0] int[1][1] int[1][2]
 */
