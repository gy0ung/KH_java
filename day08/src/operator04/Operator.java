package operator04;

public class Operator {
	int num1 = 1;
	int num2 = 1;
	
	int add() {
		return num1 + num2;
	}	
	// 전부 오버로딩	
	// 이름은 같고 매개변수의 갯수나 타입이 다른경우 오버로딩이라고 한다.	
	int add(int num1) {
		return num1+num2;
	}
	int num() { 
		return num1+num2;
	}
	int num(int num1) { 
		return num1-num2;
	}
	int num(int num1, int num2) { 
		return num1*num2;
	}
	double num(double num1) { 
		return num1/num2;
	}
	double num(double num1, int num2) { 
			return num1%num2;
	}
	double add(double num1) {
		return num1+num2;
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
	
	int add(int[] arrInt) {
		int sum = 0;
		for(int i=0; i<arrInt.length;i++) {
			sum += arrInt[i];
		}
		return sum;
	}
}
