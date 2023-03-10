package object01;

public class ObjectTest01 {

	public static void main(String[] args) {
		// 실행용 클래스
		
		Object01 ob1 = new Object01(); // Object01의 클래스를 보고 객체생성
		
		// 실행은 메인이 있는 클래스에서 실행해야함
		System.out.println(ob1.name);
		
		ob1.tel = "02-3456-9098";
		System.out.println(ob1.tel);
		
		System.out.println(ob1.addr);
		System.out.println(ob1.num);
		
		ob1.addr = "인천광역시 계양구 서운산단로 2길 42";
		System.out.println(ob1.addr);
		
		System.out.println("==============================");
		System.out.println("ob1객체의 주소 : " + ob1.addr);
		System.out.println("ob1객체의 이름 : " + ob1.name);
		System.out.println("ob1객체의 전화 : " + ob1.tel);
		System.out.println("ob1객체의 숫자 : " + ob1.num);
		
		Object01 ob2 = new Object01(); // 새로운 객체생성
		
		// 다른객체와 공유하지않고 라이브러리 클래스의 값을 그대로 가져온다.
		// 다른객체에서 변경함값으로 불러오지않음.
		System.out.println("==============================");
		System.out.println("ob2객체의 주소 : " + ob2.addr);
		System.out.println("ob2객체의 이름 : " + ob2.name);
		System.out.println("ob2객체의 전화 : " + ob2.tel);
		System.out.println("ob2객체의 숫자 : " + ob2.num);
		
		Car02 car = new Car02();
		System.out.println("==============================");
		System.out.println("car객체의 회사명 : " + car.company);
		System.out.println("car객체의 모델명 : " + car.model);
		System.out.println("car객체의 색상 : " + car.color);
		System.out.println("car객체의 기어 : " + car.gear);
		System.out.println("car객체의 최대speed : " + car.maxSpeed);
		System.out.println();
		
		car.color = "gray";
		System.out.println("car객체의 색상 : " + car.color);
	}

}
