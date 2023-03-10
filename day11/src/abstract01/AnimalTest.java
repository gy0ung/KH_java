package abstract01;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		
		dog.sound();
		cat.sound();
		frog.sound();
		System.out.println("==========================1");
		// 추상클래스는 객체생성불가
		// 메서드가 구현되어 있지않기 때문에 객체생성을 할수 없다.
//		Animal a = new Animal();
		
		// 형변환은 가능
		Animal ani = new Dog(); // 자식객체로 만들어진것을 부모객체로 형변환 
								// 오버라이딩된 것은 무조건 자식것이 호출됨
		ani.sound();
		
		ani = cat;
		ani.sound();
		
		ani = frog;
		ani.sound();
		System.out.println("==========================2");
		
		anisound(new Cat());
		anisound(new Dog());
		anisound(new Frog());
	}
	
	// 객체생성하지않아도 자신호출
	static void anisound(Animal ani) {
		ani.sound();
	}
}
