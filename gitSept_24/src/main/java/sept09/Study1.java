package sept09;

public class Study1 {

	public static void main(String[] args) {
		divideNum(123);
		exchangeResult(108000);
	}
	
	// 메소드 안에 값을 명시하지 말것. 하드코딩XX. 즉,매개변수 이용해라
	public static void divideNum(int num) {
		int firstNum = num / 100; 
		int secondNum = num % 100;
		secondNum = secondNum / 10;
		int thirdNum = num % 100;
		thirdNum = num % 10;
		
		System.out.println(firstNum +","+ secondNum +","+ thirdNum);
	}
	
	

	public static void exchangeResult(int money) {
		int oman = money / 50000;
		int namoji = money % 50000;
		int man = namoji / 10000;
		namoji = money % 10000;
		int ocheon = namoji / 5000;
		namoji = namoji % 5000;
		int cheon = namoji / 1000;		
		
		System.out.println("입력하신 총액은 " + money + "원 입니다");
		System.out.println("오만원권의 개수는 " + oman + "장 입니다");
		System.out.println("만원권의 개수는 " + man + "장 입니다");
		System.out.println("오천원권의 개수는 " + ocheon + "장 입니다");
		System.out.println("천원의 개수는 " + cheon + "장 입니다");
//		System.out.println("백원의 개수는 " +  + "개 입니다");
	}
	
	public static void exchange(int money) {
		
	}
	
	
	public static void percentTest() {
		// 나누기연산자의 결과는 몫과 나머지
		double data1 = 10; int data2 = 8; // 정수 나누기 정수 --> 결과도 정수
		double result = data1 / data2;
		System.out.println(data1 +" / "+ data2 +" = "+ result);
		
		// %의 결과값은 나머지 (나누기 연산자의 나머지가 아님)
		double dap = data1 % data2;
		System.out.println(data1 +" % "+ data2 +" = "+ dap);
		
		System.out.println(10%3); 
	}
	
	
}
