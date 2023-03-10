package abstract01;

public class Frog extends Animal {
	Frog() {
		kind = "양서류";
	}
	
	@Override
	void sound() {
		System.out.println("개굴 개굴");
	}
}
