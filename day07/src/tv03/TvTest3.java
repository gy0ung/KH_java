package tv03;

public class TvTest3 {

	public static void main(String[] args) {
		// Tv객체 생성
		Tv3 tv3 = new Tv3();
		System.out.println("현재 볼륨은 " + tv3.volume(20)+ "입니다.");
		System.out.println("현재 볼륨은 " + tv3.volume(15)+ "입니다.");
		System.out.println("현재 볼륨은 " + tv3.volumeUp(15)+ "입니다.");
		System.out.println("현재 볼륨은 " + tv3.volumeDown(5)+ "입니다.");
	}

}
