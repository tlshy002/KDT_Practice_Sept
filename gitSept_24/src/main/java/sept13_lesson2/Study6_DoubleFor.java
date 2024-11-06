package sept13_lesson2;

public class Study6_DoubleFor {

	public static void main(String[] args) {
		oneToFive3();
	}

	public static void numTop() {
		for(int i=5; i>0; i--) {
			for(int j=1; j>5-i; j++) {
				
			}
		}
	}
	public static void oneToFive3() {
		for(int i=5; i>0; i--) {
			for(int num=1; num<=6-i; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
}
