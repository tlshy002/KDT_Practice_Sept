package sept10;

public class Study4 {

	public static void main(String[] args) {
		if(gavabo2(1,2)) {
			System.out.println("무승부입니다.");
		} else {
			System.out.println("무승부가 아닙니다.");
		}
	}

	
	public static void gavabo1(int chu, int min) {
		System.out.println(chu == min); //무승부냐?
	}
	
	public static boolean gavabo2(int chu, int min) {
		return chu == min;
	}
}
