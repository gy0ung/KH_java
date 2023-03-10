package userException02;

public class Account {
	private int balance;

	
// 잔고가 얼마있는지 확인하기 위한 메서드 (balance가 private기때문에 간접적으로만 가능)
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println("입금액 " + money + "이 입금됨");
	}
	                               // ↓ 강제로 Exception 발생
	public void withdraw(int money) throws NotSufficientException {
		if(balance < money) {
			// ↓ Exception이 발생했을때
			throw new NotSufficientException("잔고부족 : " + (money-balance) + "원 부족하여 출금할 수 없음");
//			System.out.println("잔고부족 : " + (money-balance) + "원 부족");
//			return;
		}
		balance -= money;
	}
}

