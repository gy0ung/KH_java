package phone05;

// 모든지 Object를 상속받게 되어있다.
// 클래스가 상속없이 생성이되면 Object가 자동으로 상속
// public class PhoneTest extends Object 로 컴파일러가 자동으로 Object생성
public class PhoneTest  {

	public static void main(String[] args) {
		SmartPhone stP = new SmartPhone();
		stP.power();
		stP.tel("010-1234-1234");
		stP.call(false);
		stP.txt("KH정보교육원으로 갈게");
		stP.seach("KH정보교육원 가는법");
		
		System.out.println();
		
		CellPhone cP = new CellPhone();
		cP.power();
		cP.call(true);
		cP.txt("\"KH정보교육원으로 갈게\"");
//		cP.seach("KH정보교육원 가는법"); // SmartPhone클래스에 있는 seach는 호출할수없음.
	}

}

// override : ~위에 덮어쓰다, ~에 우선하다.
// 오버라이딩 : 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게
//			 변경하는것을 오버라이딩 이라고 한다.
//           무조건 자손께 먼저 실행이된다!!!

// 오버라이딩 조건 : 1. 선언부가 같아야한다. (이름, 매개변수, 리턴타입) → 매개변수가 다른건 오버로딩
//				 한 클래스에 같은건 오버라이딩이 아닌 오류이다. (부모와 자식클래스에서 같아야함)
// 오버로딩 : 기존에 없는 새로운 메서드를 정의 하는것 (new)
// 			이름만 같은 뿐 선언부는 다다르다.

