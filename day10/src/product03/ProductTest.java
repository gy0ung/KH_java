package product03;

public class ProductTest {

	public static void main(String[] args) {
		Buyer buy = new Buyer();
		buy.buy(new Computer());
		buy.buy(new Tv());
		buy.buy(new GamePlayer());
		buy.buy(new Audio());
		buy.buy(new Building());
		
		System.out.println("현재 남은 돈 : " + buy.money);
		System.out.println("현재 모인 보너스포인트 : " + buy.bonusPoint);
	}

}
