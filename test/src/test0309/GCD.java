package test0309;

import java.util.Arrays;

public class GCD {
	// 최대공약수를 구하는 클래스

	public void gcd(int num1, int num2) {
		for(int i = num1; ; i--) {
			if(num1%i == 0 && num2%i == 0) {
				System.out.println(num1 + "과 " + num2 +"의 최소공약수 : " + i);
				break;				
			}
		}
	}
	
}
