package polymorphism02;

class Animal {
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	void sound(){
		System.out.println("각 동물에 맞는 울음소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	void water() {
		System.out.println("Dog는 물을 좋아합니다.");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
	void jump() {
		System.out.println("Cat은 점프력이 좋습니다.");
	}
}

public class PolymorphismTest4 {
	public static void main(String[] args) {
		Animal an = null;
		Dog d = new Dog();
		Cat c = new Cat();
		an = c;
		an.sound();
		an.breathe();
//		an.jump(); // Animal로 형변환되어 자식인 Cat의 메서드인 jump는 호출안됨
		
		System.out.println();
		an = d;
		an.sound();
		an.breathe();
//		an.water(); // Animal로 형변환되어 자식인 Cat의 메서드인 jump는 호출안됨
		
		System.out.println();
		d = (Dog)an;
		d.sound();
		d.breathe();
		d.water();
		
//		c = (Cat)an;
//		c.sound(); // 강제형변환 안됨.
		
		Animal an2 = new Animal();
		// c = (Cat)an2; 강제형변환 안됨.
		// Animal객체만 생성되어 있기 때문 (Cat객체가 아예 만들어지지 않음)
		
		System.out.println();
		// 클래스명 instanseof 클래스명
		// 왼쪽의 객체가 오른쪽의 객체의 타입으로 만들어졌느냐를 검사
		Animal an3 = new Cat();
		if(an3 instanceof Cat) {
			Cat cat = (Cat)an3;
			System.out.println("자식클래스로 변환됨");
		}else {
			System.out.println("자식클래스로 강제형변환안됨");
		}

		// 오류가 안떠보이기때문에 instanceof를 이용하여 형변환이 되었는지 확인가능
		// 강제형변환은 이렇게 안될때가 있으니까 확인해야할것
		System.out.println();
		Animal an4 = new Animal();
		if(an4 instanceof Cat) {
			Cat cat = (Cat)an4;
			System.out.println("자식클래스로 변환됨");
		}else {
			System.out.println("자식클래스로 강제형변환안됨");
		}
	}
}
