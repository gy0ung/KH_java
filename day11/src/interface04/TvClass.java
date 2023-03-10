package interface04;

public class TvClass implements Tv, SmartTv {
	int channal;
	int volume;

	static void sInter2() {
		System.out.println("kkkk2");
	}
	
	@Override
	public void search(String search) {
		System.out.println(search + "를 검색합니다.");
	}

	@Override
	public void tvOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void tvOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setChannal(int channal) {
		if(channal > Tv.MAX_CHANNAL) {
			this.channal = Tv.MAX_CHANNAL; 
		}else if(channal < Tv.MIN_CHANNAL) {
			this.channal = Tv.MIN_CHANNAL;
		}else {
			this.channal = channal;
		}
		System.out.println("현재 채널은 " + this.channal + "입니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Tv.MAX_VOLUME) {
			this.volume = Tv.MAX_VOLUME; 
		}else if(volume < Tv.MIN_VOLUME) {
			this.volume = Tv.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
		
	}
	
	@Override
	public void internet(String url) {
		System.out.println(url + "을 검색");
	}

}
