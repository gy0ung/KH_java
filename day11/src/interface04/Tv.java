package interface04;

public interface Tv {
	int MAX_CHANNAL = 100;
	int MIN_CHANNAL = 0;
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	
	void tvOn();
	void tvOff();
	void setChannal(int channal);
	void setVolume(int volume);
}
