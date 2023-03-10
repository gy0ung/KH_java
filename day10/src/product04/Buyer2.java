package product04;

import java.util.ArrayList;

public class Buyer2 {
	int money = 500;
	int bonusPoint = 0;
	
	ArrayList<Object> item = new ArrayList<Object>();
	
	int i;

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
		item.add(p);  // ArrayList에 삽입
		System.out.println(p + "를 구입하였습니다.");
	}
	
	// 반품
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다.");
		}else {
			System.out.println("해당 물품에 대해 구매내역이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if(item.isEmpty()) {
			System.out.println("구입한 물품이 없습니다.");
			return;
		}
		
		for (int i=0; i<item.size(); i++) {
			// ArrayList의 index번호의 객체를 얻어올때 get(index) 메서드 사용
			Product p = (Product)item.get(i); 
			sum += p.price;
			itemList += p + ", ";
		}
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구매목록 : " + itemList);
	}
}
