package sept19;

public class Study2 {

	public static void main(String[] args) {
		start100for();
		start100while1();
		start100while2();
		
		for3();
		while3();
		while3_2();
		
		for4();
		while4();
		while4_1();
	}
	
	public static void start100for() {
		for(int i=100; i<=500; i+=100) {
			System.out.println("에효"+i);
		}
	}
	public static void start100while1() { // while버전1
		int cnt = 100;
		while(cnt<501) {
			System.out.println("하이ㅣㅣㅣㅣ"+cnt);
			cnt+=100;
		}
	}
	public static void start100while2() { // while버전2
		int cnt = 0;
		while(cnt<=400) {
			cnt+=100;
			System.out.println("$$$$"+cnt);
		}
	}
	//-----------------------------------------------------------------
	public static void for3() {
		for(int count=10; count>=2; count=count-2) {
			System.out.println("tlqkf"+count);
		}
	}
	public static void while3() {
		int a = 10;
		while(a>=2) {
			System.out.println("안녕1"+a);
			a-=2;
		}
	}
	public static void while3_2() {
		int a = 12;
		while(a>2) {
			a-=2;
			System.out.println("안녕2"+a);
		}
	}
	//-------------------------------------------------------------------
	public static void for4() {
		for(int i=1; i<=5; i++) {
			System.out.println("이거 언제까지해~~~~~!!!!!!"+i);
		}
	}
	public static void while4() {
		int a = 1; 
		while(a<6) {
			System.out.println("이거 언제까지 하냐고---~~!!!!&&&&&&" + a);
			a+=1;
		}
	}
	public static void while4_1() {
		int a = 0; 
		while(a<5) {
			a+=1;
			System.out.println("이거 언제까지 하냐고---~~!!!!######" + a);			
		}
	}
	
	
	

}// Class------------------------------------------------------------------
