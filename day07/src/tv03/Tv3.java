package tv03;

public class Tv3 {
	// tv의 속성
	
	// 아무것도 안넣었을때 각 참조형의 default값으로 초기화 된다
	String company;  // 기본값 null로 초기화
	String model;
	int channel;     // 기본값 0으로 초기화
	int volume;
	boolean power;   // 기본값 false로 초기화
	
	// tv의 기능(메서드)
	void power() {
		power = !power;
		if(power == true) {
			System.out.println("tv를 켭니다.");
		}else {
			System.out.println("tv를 끕니다.");
		}
	}
	int channelUp() {
		++channel;
		return channel;
	}
	int channelDown() {
		--channel;
		return channel;
	}
	int volume(int volume1) {
		return volume1;
	}
	void volume2(int volume1) {
		volume = volume1;
		System.out.println("볼륨을 조절합니다.");
	}
	int volumeUp(int volume1) {
		volume += volume1;
		return volume;
	}
	int volumeDown(int volume1) {
		volume -= volume1;
		return volume;
	}
}
