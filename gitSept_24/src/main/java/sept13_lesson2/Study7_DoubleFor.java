package sept13_lesson2;

public class Study7_DoubleFor {

	public static void main(String[] args) {
		reverseStar1();
		reverseStar2();
		
		star2();
	}
	
	// 다음을 출력하는 반복문 작성하기
	//    *
	//   *
	//  *
	// *
	//*
	
	public static void reverseStar1() {
		for(int i=1; i<6; i++) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();			
		}
	}
	public static void reverseStar2() {
		for(int i=5; i>0; i--) {
			for(int j=5; j>6-i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println();			
		}
	}
	
	//*		1행에 공백0 :1-1 (공식: 행-1)
	// *	2행에 공백1 :2-1
	//  *	3행에 공백2 :3-1
	//   *	4행에 공백3 :4-1
	//    * 5행에 공백4 :5-1
	public static void star1() {
		for(int i=0; i<0; i++) {
			for(int j=0; j<0-i; j++) {
				System.out.print(" ");
			}
		}
	}
	
	//*		5행에 공백0 :1-1 (공식: 5-행)
	// *	4행에 공백1 :2-1
	//  *	3행에 공백2 :3-1
	//   *	2행에 공백3 :4-1
	//    * 1행에 공백4 :5-1
	public static void star2() {
		for(int i=5; i<=5-i; i--) {
			System.out.println(" ");
		}
		System.out.println("*");
	}
	
	
	
	
}
