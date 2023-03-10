package product03;

public class Buyer {
	int money = 500;
	int bonusPoint = 0;
	
	// 메서드 
	// 받고자하는 매개변수 
	void buy(Product p) {
		// = new Product()
		// = new Auido()
		// = new Computer()
		// = new GamePlayer()
		// = new Tv()
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하였습니다.");
	}
}
