package test0309;

public class LCM {
	//최소 공배수를 구하는 클래스 
	
	public void lcm(int num1, int num2) {
		for(int i = num1; ; i+=num1) {
			if(i%num2 ==0) {
				System.out.println(num1 + "과 " + num2 +"의 최소공배수 : " + i);
				break;
			}
		}
	}
	
	
	
}
