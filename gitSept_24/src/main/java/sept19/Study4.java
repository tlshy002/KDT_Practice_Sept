package sept19;

public class Study4 {

	public static void main(String[] args) {
		for1();
	}
	public static void for1() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("===================");
		
		for(int i=1; i<10; i++) {
			if(i==5) {
				//break; //반복 강제종료 
				continue; //해당 회차 회피, 현재 회차 넘어가고 다음 회차로.
			}
			System.out.println(i);
		}
	}
	public static void infinityFor() {
		int i = 1;
		for(;;) { //for 를 이용한 무한반복
			System.out.println("안녕하세요");
			i++;
			if(i == 10) {
				break;
			}
		}
	}
	
	

} // class=====================================================
