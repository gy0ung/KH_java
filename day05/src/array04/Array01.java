package array04;

public class Array01 {

	public static void main(String[] args) {
		int num1=0, num2=1, num3=2, num4=3, num5=4;
		
		// 배열표시[]는 자료형 또는 변수명 어디에 붙여도 상관없다. *대체적으로 자료형 뒤에 넣음*
		// 나중에 값을 넣고자할때는 new키워드로 생성하면서 반드시 갯수를 넣어줘야 한다.
		int[] arr1 = new int[5];
		int arr2[] = new int[10];
		double[] douArr = new double[5];
		double douArr2[] = new double[10];
		int[] a = new int[] {1,2,3}; // = new int[3]; 
		
		// 배열을 만들면서 값을 같이 넣어줄수있음.
		int[] arr3 = {10,20,30,40,50,60,70,80,90,100}; // int형 4바이트씩 3개로 12바이트 저장
		char[] chArr = {'a','b','c','d','e'};		
		boolean[] boArr = {true, false, false, true, false};
		String strArr[] = {"이순신","아무개","홍길동"};
		
		// 1개의 값 출력시 index번호를 이용하여 출력
		// index번호는 반드시 0부터 시작
		System.out.println(chArr[3]);
		
		// 배열의 모든값을 출력 (반복문으로)
		for(int i =0; i<=9; i++) {
		System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		arr1[0] = 15;
		arr1[2] = 25;
		arr1[4] = 35;
		
		System.out.println(arr1[0]+ " " + arr1[2]);
		System.out.println(arr1[1]);
		
		// 규칙이 있는 값을 배열에 넣기
		for(int i = 0; i<=4; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		// 배열에 값 넣기
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[9] = 10;
		
		for(int i = 0; i<10; i++) {
			arr2[i]=i+1;
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		// 정수형 배열 10개를 생성
		// 생성한 배열에 random으로 1~100까지 추출하여 10개의 배열에 넣기
		// 출력하기
		
		int arr[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*100+1);
		/*	int ran = (int)(Math.random()*100)+1;
			arr[i]=ran; */
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
	}
}
