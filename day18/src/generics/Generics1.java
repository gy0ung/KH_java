package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		
		// ■ generics
		// 	- compile-time에 타입 제한 기능
		//  - 요소 추가시에 타입 체크 기능
		//	- 요소를 꺼낼때 해당 타입의 값을 보장
		//
		//  → 사용하는 곳에 따라
		//   - 클래스레벨 : 변수타입이나 객체생성시 작성하여 객체요소의 타입제한
		//	 - 메소드레벨 : 파라미터/리턴타입에 타입제한
		
		// JDK 1.7버전 이상부터는 우향의 제네릭은 생략가능 ! 제네릭 <>
		
		
		// boxing(auto-boxing) : 객체형으로 자동변환된다.
		//                       int → Integer.valueOf(123)
		// unboxing : 객체형태로 들어온(Integer) → int
		
		ArrayList list = new ArrayList();
		list.add("안녕");
		list.add("잘가");
		list.add("내일봐");
		list.add(123); // → boxing(auto-boxing)됨 / list.add(Integer.valueOf(123));
		
		String str = (String) list.get(0); // 제네릭을 명시하지 않았을 경우 반드시 형변환 (Object→String)	
		int i = (int) list.get(3);
		
		System.out.println(list.get(2)); 

		// 1.7버전부터 우향에 제네릭 안넣어도됨       ↓ <String>
		ArrayList<String> list1 = new ArrayList();
		list1.add("안녕");
		// list2.add(123); / 제네릭으로 String만 받게끔 지정하여 오류
		
		String str1 = (String) list1.get(0); 
		// i2 = (int) list2.get(1);  / 제네릭으로 String만 받게끔 지정하여 오류
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
//		list2.add(3.145); / 실수형 오류
		
		int num =  list2.get(1);
//		boolean bo = list2.get(2); 타입체크가능
		
		System.out.println();
		test1(); // 메인이 있는곳에 호출
		System.out.println();
		test2(); // 메인이 있는곳에 호출
	}
	
	// ■ 클래스 레벨의 제네릭
	public static void test1() {
		//        ↓ 제네릭을 안써주면 모든 <Object>
		Parking<String> strPark = new Parking<>();
		strPark.add("SM7");
		strPark.add("GENESIS");
		
		System.out.println(strPark.get(0));
		System.out.println(strPark.get(1));

		System.out.println("for문으로 출력");
		for(int i = 0; i < strPark.size(); i++ ) {
			System.out.println(strPark.get(i));
		}
		
		// 인덱스번호 찾기
		System.out.println(strPark.indexOf("SM7"));
		System.out.println(strPark.indexOf("GENESIS"));
		System.out.println(strPark.indexOf("K3"));
	}
	
	// ■ 메소드레벨의 제네릭
	public static void test2() {
		int num1 = run(10); // run(Integer.valueOf(10))
		int num2 = run(20); // run(Integer.valueOf(10))
		String str = run("abc");
		
		System.out.println(num1+num2);
		System.out.println(str+num1+num2);
		
		System.out.println();
		List<Integer> intList = of(1,2,3,4);
		System.out.println(intList);
		
		List<String> strList = of("5교시","졸려요","제네릭");
		System.out.println(strList);
		
		// 자바에서 Array을 List 변환해주는 메소드 Arrays.asList(array) 사용
		// JDK 9버전부터 List.of(array)라는 새로운 팩토리 메소드 사용
		
		// Arrays.asList, List.of : 변경불가 list임. 삽입, 삭제불가
		List<String> strList2 = List.of("자요","졸면안되요");
		System.out.println(strList2); 
//		strList2.add("말똥말똥"); // 오류발생 변경불가하여 삽입 불가능 (삭제도불가능)
		
	}
	
	//             ↓ 타입에 따라서 들어오는 타입이 달라진다.
	public static <T> T run(T t) {
		return t;
	}
	
	//             ↓ 타입에 따라서 들어오는 타입이 달라진다.
	public static <E> List<E> of(E...elems) { // ...은 매개변수가 0~무한대로 들어오면된다
		List<E> list = new ArrayList<>();
		
		for(E e : elems) {
			list.add(e);
		}
		return list;
	}
}
