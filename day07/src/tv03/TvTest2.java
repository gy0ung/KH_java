package tv03;

public class TvTest2 {

	public static void main(String[] args) {
		// Tv객체 생성
		Tv2 tv2 = new Tv2();
		tv2.company = "LG";
		tv2.model = "HD 70인치";
		
		System.out.println("어느회사 tv인가요? : " + tv2.company);
		System.out.println("모델명은 무엇인가요? : " + tv2.model);
		
		tv2.power(); 
		
		int volume = tv2.volumeUp();
		volume = tv2.volumeUp();
		System.out.println("===================");
		System.out.println("현재 볼륨은 " + volume + "입니다.");
		System.out.println("현재 볼륨은 " + tv2.volumeUp()+ "입니다.");
		
		volume = tv2.volumeDown();
		System.out.println("===================");
		System.out.println("현재 볼륨은 " + volume + "입니다.");
		System.out.println("===================");
		
		tv2.channelUp();
		System.out.println("현재 채널은 " + tv2.channel + "입니다.");
		tv2.channelUp();
		System.out.println("현재 채널은 " + tv2.channel + "입니다.");
		tv2.channelDown();
		System.out.println("현재 채널은 " + tv2.channel + "입니다.");
		
		tv2.volumeUp();
		System.out.println("현재 볼륨은 " + tv2.volume + "입니다.");
		tv2.volumeDown();
		System.out.println("현재 볼륨은 " + tv2.volume + "입니다.");
		
		tv2.power();
		tv2.power();
		
	}

}
