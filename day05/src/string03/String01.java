package string03;

public class String01 {

	public static void main(String[] args) {
		// 참조자료형에서 ==, !=는 객체가 생성된 주소가 같은지 같지않은지를 비교
		String name = "홍길동";
		String name2 = "홍길동";
		
		System.out.println("name과 name2 주소가 같은가? : " + (name == name2));
		
		String name3 = new String ("kh정보교육원");
		String name4 = new String ("kh정보교육원");
		
		System.out.println("name3과 name4 주소가 같은가? : " + (name3 == name4));
		
		String name5 = "아무개";
		String name6 = "홍길동";
		
		System.out.println("name5와 name6 주소가 같은가? : " + (name5 == name6));
		
		// 객체는 덮어쓰기가 없음. 변경되면 새로운 객체가 생성된다.
		
		name = "이순신";
		
		System.out.println("name과 name6 주소가 같은가? : " + (name == name6));
		
		System.out.println("name3과 name4 값이 같은가? : " + name3.equals(name4));
		System.out.println("name3과 name4 값이 같지않은가? : " + !(name3.equals(name4)));
		
		boolean bool = name.equals("이순신");
		System.out.println(bool);
	}

}
