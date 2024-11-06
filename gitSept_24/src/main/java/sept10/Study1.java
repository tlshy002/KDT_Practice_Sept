package sept10;

public class Study1 {
	
	public static void test1() {
		int sum = 5 + 6;
//		int total = sum + 100;
	}
	
	public static int test2() {
		int a =1; int b = 1;
		return a+b;
	} // 리턴메서드는 결과물이 데이터이기 때문에 함수호출 + 함수호출 가능 
	
	public static long test3() {
		return 100L;
	}
	
	public static double showStadardWeight(double sinjang, double momuge) {
		double result = (sinjang - 100) * 0.9;
		return result;
	}
	
	

	public static void main(String[] args) {
		test1(); // 5+6이 실행되고 종료. 이와같이 해당 메서드 안에 있는 프로그램이 처리되고 종료되는걸 void 메서드 라고함
		test2(); // 해당 메서드 안에 있는 프로그램이 처리되고 리턴한 후(마지막에 데이터로 바뀐후) 종료되는 메서드 -> return 메서드
		// 데이터의 타입을 항상 생각할 것!!!
		
		long result = test2() + test3();
		System.out.println(result);
		
		System.out.println(showStadardWeight(173.5, 85.1));
		
	}

}
