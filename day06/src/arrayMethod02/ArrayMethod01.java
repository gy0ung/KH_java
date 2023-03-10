package arrayMethod02;

import java.util.Arrays;

public class ArrayMethod01 {

	public static void main(String[] args) {
		int[] num = {1,8,9,10,5};
		int[] result = new int[10];
		
		for(int i=0; i<num.length; i++) {
			result[i+2] = num[i];
		}
		System.out.println("result 배열 : " +Arrays.toString(result));
		
		int[] re2 = Arrays.copyOf(num, 3);
		System.out.println("re2 배열 : " +Arrays.toString(re2));
		
		int[] re3 = Arrays.copyOfRange(num, 1, 4);
		System.out.println("re3 배열 : " +Arrays.toString(re3));
		
		// System 클래스의 method사용
		int[] re4 = new int[10];
		System.arraycopy(num, 2, re4, 3, 2);
		System.out.println("re4 배열 : " +Arrays.toString(re4));
		
	}

}
