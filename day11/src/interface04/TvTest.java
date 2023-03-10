package interface04;

public class TvTest {

	public static void main(String[] args) {
		TvClass tvc = new TvClass();
		tvc.tvOn();
		tvc.setChannal(110);
		tvc.setVolume(-4);
		tvc.search("자바");
		tvc.tvOff();
		tvc.internet("java");
		tvc.sInter2();

		System.out.println("=================");
		Tv tv = tvc;
		tv.tvOn();
		tv.setChannal(50);
		tv.setVolume(120);
		tv.tvOff();
		
		System.out.println("=================");
		SmartTv stv = tvc;
		stv.search("KH교육원");
	}
	static void method(Tv tv) {
		Tv t = new TvClass();
	}

}
