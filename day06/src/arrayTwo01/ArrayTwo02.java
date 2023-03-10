package arrayTwo01;

public class ArrayTwo02 {

	public static void main(String[] args) {
		int[][] score = {{90,89,100},
						 {89,97,48},
						 {68,93,88},
						 {79,38,92},
						 {100,59,81}};
		
		// 사람별 총점, 평균
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		for(int i =0; i<score.length; i++) {
			int sum=0; // sum이 밖for문 밖에있으면 계속 더하여 마지막은 총 합계가 나옴
			
			korSum += score[i][0];
			mathSum += score[i][1];
			engSum += score[i][2];
			
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.print(sum + " ");
			// 평균값 출력
//			System.out.print((double)sum/score[i].length);
			System.out.printf("%.1f\n",(double)sum/score[i].length);
		}
		
		System.out.println("====================================");
		System.out.println("   국어   수학   영어   총점    평균");
		System.out.println("------------------------------------");
		
		for(int i =0; i<score.length; i++) {
			int sum=0; // sum이 밖for문 밖에있으면 계속 더하여 마지막은 총 합계가 나옴
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
//				System.out.print(score[i][j]+"  ");
				System.out.printf("%6d", score[i][j]);
			}
			System.out.printf("%6d",sum );
			// 평균값 출력
//			System.out.print((double)sum/score[i].length);
			System.out.printf("%8.1f\n",(double)sum/score[i].length); // 점까지 반영해야 하므로 +2
		}
		System.out.println("====================================");
		System.out.printf("%6d%6d%6d",korSum,mathSum,engSum);
		System.out.printf("%6d",korSum+mathSum+engSum);
		System.out.printf("%8.1f",(korSum+mathSum+engSum)/(double)3);
		
//		for문을 새로만들어서 각 과목의 합계와 평균값 구하기
		
		
/*		int i = 0;
		int z = 0;
		int sum2=0;
		int totalsum =0;
		
		for(int j=0; j<score[z].length; j++) {
			sum2=0;
			z++;
			for( i =0; i<score.length; i++) {
				sum2 += score[i][j];
			}
			System.out.printf("%6d",sum2);
			totalsum+=sum2;
		}
			System.out.printf("%6d",totalsum);
			System.out.println();
			System.out.println("===================================="); */
			
			//세분화 연습용
	/*		for(int i =0; i<score.length; i++) {
				int sum=0; // sum이 밖for문 밖에있으면 계속 더하여 마지막은 총 합계가 나옴
				for(int j=0; j<score[i].length; j++) {
					sum += score[i][j];
					System.out.print("score[" + i+ "][" + j +"]"+ "의 값 : " +score[i][j]+"  ");
				}
				System.out.print("score[" + i + "] 의 합계 : " + sum + "   ");
				// 평균값 출력
//				System.out.print((double)sum/score[i].length);
				System.out.printf("score["+ i + "] 의 평균 : " + "%.1f\n",(double)sum/score[i].length);

			} */
	}
}

