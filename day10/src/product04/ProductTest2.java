package product04;

public class ProductTest2 {

	public static void main(String[] args) {
		
		// 반품메서드를 이용하려면 객체를 매번 새로 생성하여 호출하는것이 아닌,
		// 생성된 객체를 변수초기화하여 해당 변수로 넣어줘야지 반품메서드로 사용가능하다.
		// ArrayList 배열삭제를 위해
		Buyer2 b2 = new Buyer2();
		Computer com = new Computer();
		Tv tv = new Tv();
		GamePlayer game = new GamePlayer();
		Audio audio = new Audio();
		
		b2.buy(com);
		b2.buy(tv);
		b2.buy(game);
		b2.refund(tv);
		b2.refund(audio);
		b2.buy(audio);
		b2.buy(tv);
		b2.buy(tv);
		
		System.out.println();
		System.out.println("현재 남은 돈 : " + b2.money);
		System.out.println("현재 모인 보너스포인트 : " + b2.bonusPoint);
		
		b2.summary();
		
		// 형변환
		Product p = new Product(50);
		Product p1 = new Computer();
		Product p3 = new Tv();
	}

}
