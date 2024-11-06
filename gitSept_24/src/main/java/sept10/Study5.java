package sept10;

public class Study5 {

	public static void main(String[] args) {
		divideNum(123);
		exchangeResult(15000);
	}
	
	
	public static void divideNum(int num) {
		if(num > 999) {
			System.out.println("잘못된 입력입니다.");
		} else if (num < 100) {
			System.out.println("잘못된 입력입니다.");			
		} else {
			int firstNum = num / 100; 
			int secondNum = num % 100;
			secondNum = secondNum / 10;
			int thirdNum = num % 100;
			thirdNum = num % 10;
			
			System.out.println(firstNum +","+ secondNum +","+ thirdNum);
		}
		System.out.println("프로그램 종료");
	}
	
	public static void exchangeResult(int money) {
		if(money < 1000) {
			System.out.println("금액이 너무 적습니다. 천원이상 입력해주세요.");
		} else {
			exchange(money);
		}
	}
	
	public static void exchange(int money) {
		int oman = money / 50000;
		int namoji = money % 50000;
		int man = namoji / 10000;
		namoji = money % 10000;
		int ocheon = namoji / 5000;
		namoji = namoji % 5000;
		int cheon = namoji / 1000;		
		
		showResult(money, oman, man, ocheon, cheon);
	}
	
	public static void showResult(int money, int oman, int man, int ocheon, int cheon) {
		System.out.println("입력하신 총액은 " + money + "원 입니다");
		System.out.println("오만원권의 개수는 " + oman + "장 입니다");
		System.out.println("만원권의 개수는 " + man + "장 입니다");
		System.out.println("오천원권의 개수는 " + ocheon + "장 입니다");
		System.out.println("천원의 개수는 " + cheon + "장 입니다");
//		System.out.println("백원의 개수는 " +  + "개 입니다");
	}
	
	
}
