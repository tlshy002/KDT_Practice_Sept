package sept23;

public class Study1_doWhile {

	public static void main(String[] args) {
		//countUpFor();
		countUpDoWhile();
	}

	public static void countUpFor() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	public static void countUpWhile() {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}	
	
	public static void countUpDoWhile() {
		int cnt = 1;//A
		do {
			System.out.println(cnt);
			cnt++; //C
		} while(cnt<=10); //B
	}
	
	
	
} //class====================================================== 