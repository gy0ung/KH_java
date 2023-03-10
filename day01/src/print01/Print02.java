package print01;

public class Print02 {

	public static void main(String[] args) {
		// 문자열에서 +는 연결기호 / 숫자열에서 +는 연산자
		System.out.println(5+3+" : 5+3의 연산결과 출력");
		
		// 문자열로 시작하면 뒤에도 문자열로 인식한다. / 뒤에 오는 문구를 숫자로 인식하고 싶으면 가로를 넣어주어야한다.
		// +,-는 문자열 뒤에서 연산하고자하면 반드시 괄호 안에 넣어야한다.
		System.out.println("5+3의 연산결과 출력 : "+5+3); // "5+3의 연산결과 출력 : "+"5"+"3" 와 동일
		System.out.println("5+3의 연산결과 출력 : " + (5+3));
		System.out.println("5-3의 연산결과 출력 : " + (5-3));
		
		// 문자열 뒤에서 연산할때 *,/ 은 상관없음 / 가로를 넣든 안넣든 똑같이 출력된다.
		System.out.println("5*3의 연산결과 : " + 5*3);
		System.out.println("5/3의 연산결과 : " + 5/3); // 정수/정수는 정수로 나온다.
	}

}
