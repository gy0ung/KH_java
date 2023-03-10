package tv03;

public class TvTest {

	public static void main(String[] args) {
		// Tv객체 생성
		Tv tv1 = new Tv();
		tv1.company = "삼성";
		tv1.model = "UHD 50인치";
		
		System.out.println("어느회사 tv인가요? : " + tv1.company);
		System.out.println("모델명은 무엇인가요? : " + tv1.model);
		
		tv1.power(); // true  / 출력하라는 출력문이없기때문에 출력은 안됨
		tv1.power(); // false
		tv1.power(); 
		
		tv1.channelUp();
		System.out.println("현재 채널은 " + tv1.channel + "입니다.");
		tv1.channelUp();
		System.out.println("현재 채널은 " + tv1.channel + "입니다.");
		tv1.channelDown();
		System.out.println("현재 채널은 " + tv1.channel + "입니다.");
		
		tv1.volumeUp();
		System.out.println("현재 볼륨은 " + tv1.volume + "입니다.");
		tv1.volumeDown();
		System.out.println("현재 볼륨은 " + tv1.volume + "입니다.");
		
		tv1.power();
		tv1.power();
		
	}

}
