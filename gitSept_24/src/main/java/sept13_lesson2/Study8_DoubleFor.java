package sept13_lesson2;

public class Study8_DoubleFor {

	public static void main(String[] args) {
		top1(10);
//		top2();
	}
	
	
	public static void top1(int height) { //하드코딩 노농... 인자를 받자
		for(int i=0; i<height; i++) { //i: 0~0
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	//*		높이3, (4-높이)=*1개
	//**	높이2, (4-높이)=*1개
	//***	높이1, (4-높이)=*1개
	public static void top2(int height) { //하드코딩 노농... 인자를 받자
		for(int i=4; i>0; i--) { //i: 0~0
			for(int j=5; j<6-i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	
	
	
	public static void test() {
		for(int i=11; i>0; i--) { // i: 11~1
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	

}
