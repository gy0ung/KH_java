package interface03;

import java.net.MulticastSocket;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.setVolume(80);
		sp.search("인터페이스");
		sp.turnOff();
		System.out.println("--------------------------");
		Phone phone = sp;
		phone.turnOn();
		phone.turnOff();
		phone.setVolume(-5);
		System.out.println("--------------------------");
		Searchable sa = new SmartPhone();
		sa.search("추상클래스");
	}

}
