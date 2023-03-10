package abstract01;

public class Dog extends Animal {
	Dog(){
		kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
