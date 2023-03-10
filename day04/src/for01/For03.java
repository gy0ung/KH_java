package for01;

public class For03 {

	public static void main(String[] args) {
		// 1~100까지 홀수의 합
		
		int oddSum = 0;
		int addSum = 0;
		for (int i=1; i<=100; i+=2) {
			oddSum =oddSum + i; // oddSum = oddSum+i;
		}
			System.out.println("1~100까지 홀수의 합 : " + oddSum);
		
		System.out.println("=========================");
		
		oddSum = 0;
		addSum = 0;
		int evenSum = 0;
		// oddSum = 0; ← 해당 변수를 다시 사용하고싶으면 0으로 초기화 한후에 사용
			for (int j=0; j<=100; j+=2) {
		//  for (int j=2; j<=100; j+=2)
			addSum = addSum + j; 
			}
			
			for(int z = 1; z<= 100; z++) {
				if(z%2==0)
					evenSum += z;
				else
					oddSum += z;
			}
		
			System.out.println("1~100까지 짝수의 합 : " + addSum);
			System.out.println("1~100까지 홀수의 합 : " + oddSum);
			System.out.println("1~100까지 짝수의 합 : " + evenSum);
		
	}

}
