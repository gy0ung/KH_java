package phone05;

public abstract class Phone {
	boolean power;
	boolean call = true;
	String tel;
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("전원을 켭니다.");
		}else {
			System.out.println("전원을 끕니다.");
		}
	}
	
	abstract void bell();
	abstract void pickUp();
	abstract void hangUp();
	
}
