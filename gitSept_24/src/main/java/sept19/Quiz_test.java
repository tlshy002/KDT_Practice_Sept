package sept19;

public class Quiz_test {

	public static void main(String[] args) {
		for1();
		while1();
		while1_1();

		for2();
		while2();
		while2_1();

		for3();
		while3();
		while3_1();
	}
	
	public static void for1() {
		for(int i=100; i>=30; i-=10) {
			if(i==30) {
				System.out.println(i);
			} else {
				System.out.print(i+",");				
			}
		}
		System.out.println("--------------------------");
	}
	public static void while1() {
		int a=100;
		while(a>29) {
			if(a==30) {
				System.out.println(a);
				a = 0; //while 무한반복 탈출
			} else {
				System.out.print(a+",");
				a-=10;
			}
		}
		System.out.println("--------------------------");
	}
	public static void while1_1() {
		int a=110;
		while(a>=40) {
			if(a==40) {
				a-=10;
				System.out.println(a);
				break; //while 무한반복 탈출
			} else {
				a-=10;
				System.out.print(a+",");				
			}
		}
		System.out.println("==========================");
		System.out.println();
	} //----------------------------------------------
	// 0~7 
	public static void for2() {
		for(int i=0; i<8; i++) {
			System.out.println(i);
		}
	}
	public static void while2() {
		int a = 0;
		while(a>8) {
			System.out.println(a);
			a+=1;
		}
	}
	public static void while2_1() {
		int a = -1;
		while(a<7) {
			a+=1;
			System.out.println(a);
		}
	} //----------------------------------------------
	//-10,-8,-6,~ 0,2,4
	public static void for3() {
		for(int i=-10; i<=4; i+=2) {
			System.out.println(i);
		}
	}
	public static void while3() {
		int a = -10;
		while(a<=4) {
			System.out.println(a);
			a+=2;
		}
	}
	public static void while3_1() {
		int a = -12;
		while(a<=2) {
			a+=2;
			System.out.println(a);
		}
	}

	
} //class---------------------------------------------
