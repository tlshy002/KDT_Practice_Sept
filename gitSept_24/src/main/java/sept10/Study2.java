package sept10;

public class Study2 {

	public static void main(String[] args) {
		boolean result = gavabo1(1, 1); //가위1, 바위2, 보3
		System.out.println("무승부 입니까?: " + result);

		int resultNum = num1() + num2() - num3() - num4();
		System.out.println("값은 = " + resultNum);
	}
	
	public static boolean gavabo1(int chu, int min) {
		return chu == min;
	}
	
	public static int num1() { return 100; }
	public static int num2() { return 500; }
	public static int num3() { return 200; }
	public static int num4() { return 300; }

}
