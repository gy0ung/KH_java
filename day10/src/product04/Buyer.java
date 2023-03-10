package product04;

public class Buyer {
	int money = 500;
	int bonusPoint = 0;
	// 배열은 한번만들면 늘릴수없기때문에 넉넉한 저장공간으로 만들어주는것이 좋다.
	// 증가를 하고싶으면 더 큰배열을 만들고 copy해서 넣어야한다.
	
	Product[] cart = new Product[10]; 
	int[] num = new int[10];
	String[] str = new String[10];
	
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
		cart[i++] = p;
		System.out.println(p + "를 구입하였습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";
		int sum2 = 0;
		String itemList2 = "";
		// 하기의 두 for문은 동일함 (배열 cart의 값을 전부 출력)
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("총 구입금액1 : " + sum);
		System.out.println("구매목록1 : " + itemList);
		
		for (Product i : cart) {
			if (i == null)
				break;
			sum2 += i.price;
			itemList2 += i + ", ";
		}
		System.out.println("총 구입금액2 : " + sum2);
		System.out.println("구매목록2 : " + itemList2);
	}
}
