package exception01;

class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};

public class _05_ClassCastException {

	public static void main(String[] args) {
		try {
			Dog dog = new Dog();  // 객체생성
			Animal ani = dog;     // 부모타입으로 강제형변환
			Dog dog1 = (Dog)ani;  // Dog타입으로 형변환
			System.out.println("Dog타입으로 변경");
			
			Animal ani2 = new Animal();
			Cat cat = (Cat)ani2; 
			System.out.println("Cat타입으로 변경");
		} catch(ClassCastException e) {
			System.out.println("오류 메시지 : " + e);
			
		}
	}	

}
