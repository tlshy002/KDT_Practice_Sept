package sept10;

public class Study3 {

	public static void main(String[] args) {
		ifElseOP1();
	}

	public static void ifOP() {
		System.out.println("1");
		if(true) {
			System.out.println("2");
			System.out.println("3");
		}
		System.out.println("4");
	}
	
	public static void ifElseOP1() {
		System.out.println("1");
		if(false) {
			System.out.println("2");
			System.out.println("3");
			
		} else {
			System.out.println("4");
			System.out.println("5");
		}
		
		System.out.println("6");
	}
	
	public static void ifElseOP2() {
		System.out.println("1");
		if(false) {
			System.out.println("2");
			System.out.println("3");
			
		} else if(false) {
			
		}
		
		else {
			System.out.println("4");
			System.out.println("5");
		}
		
		System.out.println("6");
	}
	
	
	
}
