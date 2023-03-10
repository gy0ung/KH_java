package interface03;

public interface Phone {
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
