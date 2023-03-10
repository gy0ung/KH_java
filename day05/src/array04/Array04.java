package array04;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		int[] arr1 = {39,34,29,67,19,95,38,75,4,68};
		System.out.println(Arrays.toString(arr1));
		
		char[] chArr = {'a','b','c','d','e'};		
		boolean[] boArr = {true, false, false, true, false};
		String strArr[] = {"이순신","아무개","홍길동"};
		
		// char는 char의 배열로 String을 만들기때문에 
		// char외에 다른 자료형들은 주소값이 나오지만 char는 그대로 출력된다. 
		System.out.println(chArr);
		
		System.out.println("=========================================");
		
		System.out.println(Arrays.toString(chArr));
		System.out.println(Arrays.toString(boArr));
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
		
		
	}

}
