package decimalFormat01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat1 {

	public static void main(String[] args) {
		// 변수 number을 1234567.89로 초기화
		double number = 1234567.5;
		
		// 객체생성하여 형식설정                   ↓ String만 올수있음
		DecimalFormat df = new DecimalFormat("0");
		
		// ↓ DecimalFormat("0")의 형식으로 number를 출력해라 
 		System.out.println(df.format(number));
 		System.out.println(new DecimalFormat("0").format(123.21));
 		// 위의 두 형식을 같은코드 (number도 그냥 숫자로 입력가능)

 		System.out.println("--------------------");
		
 		// "0"과 "#"은 비슷하게 쓸수있다.
 		System.out.println(new DecimalFormat("0").format(number));
 		System.out.println(new DecimalFormat("#").format(number));
 		System.out.println("--------------------");
 		// "0.0"은 무조건 자리차지 (없어도 0이 무조건출력)
 		System.out.println(new DecimalFormat("0.0").format(number));
 		// "#.#"은 없으면 출력하지않는다. (0과 #의 차이)
 		System.out.println(new DecimalFormat("#.#").format(number));
 		System.out.println("--------------------");
 		// 없어도 무조건 0으로 출력된다. 무조건 자리차지함! #은 자리가있는 숫자까지만 나옴
 		System.out.println(new DecimalFormat("00000000.00").format(number));
 		System.out.println(new DecimalFormat("########.##").format(number));
 		System.out.println("--------------------");
		
 		// 무조건 마이너스를 붙임 (음수와 별개로 그냥 문자열-를 붙임) 음수의미x
 		System.out.println(new DecimalFormat("#.#-").format(number));
 		System.out.println(new DecimalFormat("-#.#").format(number));
 		System.out.println("--------------------");
 		
 		// 음수일때는 - 양수일때는 +를 붙여 나타냄
 		System.out.println(new DecimalFormat("+#.#;-#.#").format(number));
 		System.out.println("--------------------");
		
 		// 자리마다 ,를 찍으세요 
 		System.out.println(new DecimalFormat("#,###.#").format(number));
 		System.out.println(new DecimalFormat("#,####.#").format(number));
 		System.out.println("--------------------");
		
 		// 퍼센트로 나타냄 *100
 		System.out.println(new DecimalFormat("#.#%").format(number));
 		// 유니코드로 원 (\u00A4)
 		System.out.println(new DecimalFormat("\u00A4#.#").format(number));
 		// 역슬래쉬를 사용해야할때는 두개를 넣으면 역슬래쉬가 나타난다.
 		System.out.println(new DecimalFormat("\\#.#").format(number));
 		System.out.println("------------");
 		
 		
 		// parse() 는 DecimalFormat의 조상인 NumberFormat에 정의되어 있는 메소드 : 문자열을 숫자로 변환
 		// Number는 래퍼클래스의 조상 (기본자료형(int, double, char)을 → Integer, Double 객체화하기 위해 만든 클래스)
 		// intValue(), doubleValue()
 		
 		String stNum = "1,234,567.89";
 		DecimalFormat df2 = new DecimalFormat("#,###.##");
 		
 		try {
 			Number num = df2.parse(stNum);
 			System.out.println(num);
 			// System.out.println(num*2); // 객체(Number)타입으로 변환을 했기 때문에 연산안됨
 			
 			double douNum = num.doubleValue(); // 실수형으로 변환
 			System.out.println(douNum*2);
 			
 			// 한줄로
 			System.out.println((new DecimalFormat("#,###.##").parse("1,234,567.89").doubleValue())*3);
 		}catch(ParseException e) {
 			e.printStackTrace();
 		}
 		
 		
 		
 		
	}
	
}
