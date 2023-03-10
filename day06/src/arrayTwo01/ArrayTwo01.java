package arrayTwo01;

public class ArrayTwo01 {

	public static void main(String[] args) {
		//                       행 열
		int[][] score1 = new int[5][3];
		int[][] score2 = {{34,78,98},
						  {100,87,59,68}};
		// score2[0][2] = 98
		System.out.println(score2[0][2]);
		System.out.println(score2[1][1]);
		
		score1[1][2] = 100;
		score1[1][1] = 50;
		
		System.out.println("score2 배열의 길이(행의 길이) : " + score2.length);
		System.out.println("score1 배열의 길이(행의 길이) : " + score1.length);
		
		System.out.println("score2 배열의 [0]행의 열의 길이 : " + score2[0].length);
		System.out.println("score2 배열의 [1]행의 열의 길이 : " + score2[1].length);
		
		System.out.println("====================");
		int[][] score3 = {{34,78,98},
						  {100,87,59}};
		for(int i = 0; i<score3.length; i++) {
			for(int j=0; j<score3[0].length;j++) {
				System.out.print(score3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		int[][] score4 = {{34,78,98},
					      {100,87,59,96},
		                  {34,97}};
		for(int i = 0; i<score4.length; i++) {
			for(int j=0; j<score4[i].length;j++) {
				System.out.print(score4[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열 3행 5열 생성
		// 값 1~15 넣기
		// 출력하기
		
		System.out.println("====================");
		int[][] score5 = new int[3][5];
		int z = 0;
		for(int i=0;i<score5.length;i++) {
			for(int j=0; j<score5[i].length; j++) {
				score5[i][j] = ++z;
			/*	int num = (int)((Math.random()*15))+1;
				score5[i][j] = num;
				System.out.print(score5[i][j]+" "); */
				System.out.print(score5[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}
