package product03;

public class Product {
	int price; // 사는 물품의 가격
	int bonusPoint; // 사는 물품가격의 10%를 보너스로 지급
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}

	/*
	// private으로 접근제어가 설정되어있는 경우 하기의 메서드입력
	int getPrice() {
		return price;
	}
	*/
}
