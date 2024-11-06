package sept19;

public class Study3_DoubleWhile {

	public static void main(String[] args) {
		doubleWhile2();
	}
	
	public static void gugudan(){
		for(int dan=2; dan < 10;dan++) {//단을 위한 반복(2부터 1씩 증가하면서 9까지)
			System.out.println("***"+dan+"단***");
			for(int su=1; su < 10;su++) {//수를 위한(1부터 1씩 증가하면서 9까지)
				System.out.println(dan+" * "+su+" = "+(dan * su));
			}			
		}
	}
	
	public static void doubleWhile() {
		int dan = 2;
		while(dan <= 9) { //단을 위한 반복(2~9까지)
			System.out.println("***"+dan+"단***");
			int su = 1;
			while(su <= 9) { //수 계산을 위한 반복(1~9까지)
				System.out.println(dan+" * "+su+" = "+ dan*su);
				su++;
			}
			dan++;
			System.out.println();
		} 
	}
	public static void doubleWhile2() {
		int dan = 1;
		while(dan < 9) { //단을 위한 반복(2~9까지)
			dan++;
			System.out.println("***"+dan+"단***");
			int su = 1;
			while(su < 9) { //수 계산을 위한 반복(1~9까지)
				su++;
				System.out.println(dan+" * "+su+" = "+ dan*su);
			}
			System.out.println();
		} 
	}
	
	
	
	

	
} //class--------------------------------------------------------------
