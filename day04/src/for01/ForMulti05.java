package for01;

public class ForMulti05 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int z=9; z>4; z--) {
				System.out.println("i =" + i + ",  z =" + z);
			}
		}

		System.out.println("====================");
		
		for(int dan = 2; dan<=9; dan++) {
			System.out.println(dan + "단");
			for(int s = 1; s<=9; s++) {
				System.out.println(dan + " * " + s + " = " + (dan*s));
			}
			System.out.println();
		}
		
		
	}

}
