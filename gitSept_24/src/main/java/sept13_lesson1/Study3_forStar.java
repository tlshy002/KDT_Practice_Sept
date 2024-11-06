package sept13_lesson1;

public class Study3_forStar {

	public static void main(String[] args) {
		victory();
	}
	public static void victory() {
		point1();
		point2();
		point3();
		point4();
		
		piture1();
		piture2();
		piture3();
		piture4();
		
		minus1();
		minus2();
		minus3();
		minus4();
	}
	
	public static void piture1() {
		System.out.print('*');
		for(int i=0; i<5; i++) {
			System.out.print(' ');
		}
		System.out.println('*');
	}
	public static void piture2() {
		System.out.print(" *");
		for(int i=0; i<3; i++) {
			System.out.print(' ');
		}
		System.out.println("* ");
	}
	public static void piture3() {
		System.out.print("  *");
		for(int i=0; i<1; i++) {
			System.out.print(' ');
		}
		System.out.println("*  ");
	}
	public static void piture4() {
		for(int i=0; i<3; i++) {
			System.out.print(' ');
		}
		System.out.println("*");
	}
	
	
	public static void point1() {
		for(int i=0; i<3; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void point2() {
		System.out.print("  *");
		for(int i=0; i<1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void point3() {
		System.out.print(" *");
		for(int i=0; i<3; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void point4() {
		System.out.print("*");
		for(int i=0; i<5; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}

	public static void minus1() {
		for(int i=10; i>7; i--) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void minus2() {
		System.out.print("  *");
		for(int i=10; i>9; i--) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void minus3() {
		System.out.print(" *");
		for(int i=10; i>7; i--) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void minus4() {
		System.out.print("*");
		for(int i=10; i>5; i--) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	

}
