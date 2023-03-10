package varialbe02;

public class Variable02 {

	public static void main(String[] args) {
		int x = 10;
		double pi = 3.141519;
		char ch = 'a'; // 반드시 1글자만
		boolean bool = false;
		String str = "abc"; // 안넣어도(스페이스바) 되고 1글자 이상이어도 됨
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("---------");
		
		bool = 50 > 40;
		System.out.println(bool);
		System.out.println("---------");
		
		// long형은 반드시 뒤에 L자를 붙여줘야한다.(대소문상관없으나 숫자1과 헷갈릴수 있기때문에 대문자지향)
		//  붙여주지않으면 int형으로 인식하기때문
		long long1 = 1234567845478123482L;
		
		// float형은 반드시 뒤에 F자를 붙여줘야한다.(대소문상관없음) 
		// 붙여주지않으면 double형으로 인식하기때문
		float fl = 45.3174f;
	
		
		
	}

}
