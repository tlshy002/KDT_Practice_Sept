package sept13_lesson1;

public class Study4_forStar {

	public static void main(String[] args) {
		triangle90();
//		triangle90_2();
	}
	
	public static void triangle90() {
		System.out.println("*");
		for(int i=1; i<3; i++) {
			System.out.print("*");
		} System.out.println();
		
		for(int i=5; i<16; i+=5) { //i+=5이건되고
			System.out.print("*");
		}System.out.println();

		for(int i=3; i<10; i+=2) { //i=+2이건안됨
			System.out.print("*");
		}System.out.println();

		for(int i=10; i>5; i--) {
			System.out.print("*");
		}System.out.println();
	}
	
	public static void triangle90_2() {
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
	}	
	

}
