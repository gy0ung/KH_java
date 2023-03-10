package for01;

public class ForMulti07 {

	public static void main(String[] args) {
		// 변수선언과 증감식은 여러개 들어갈수있으나, 가운데 조건은 꼭 한개만 들어가야함.
		// for문 안에 변수가 여러개여도 된다.
		// 단, 조건식은 반드시 1개 여야한다.
		for(int i=1, j=10, x=100; j>=1; i++, j--,x+=2) {
			System.out.println("i = " + i + ", j = " + j + ", x = " + x);
		}
		
		System.out.println("=============================");
		
		// 무한반복을 의미
		int num1 = 10;
		for(;;) {
			System.out.println(num1);
			num1++;
			if(num1==20)
				break; // 반복문을 빠져나올때 사용
		}
		
	}

}
