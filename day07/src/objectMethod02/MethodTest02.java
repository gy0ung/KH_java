package objectMethod02;

class Arithmetix {
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int subtract(int x, int y) {
		return x - y;
	}
	int multiply(int x,int y) {
		return x*y;
	}
	double divide(double x, int y) { // 반환값외의 변수설정가능
		return x/y;
	}
}

public class MethodTest02 {

	public static void main(String[] args) {
		Arithmetix am1 = new Arithmetix();
		int result = am1.add(7, 8);
		System.out.println(result);
		result = am1.multiply(6, 2);
		System.out.println(result);
		
		result = am1.multiply(2930, 671);
		System.out.println(result);
		
		double result2 = am1.divide(9, 6);
		System.out.println(result2);
	}

}
