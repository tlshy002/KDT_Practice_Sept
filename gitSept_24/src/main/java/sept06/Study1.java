package sept06;

public class Study1 {

	public static void main(String[] args) {
		int su = 100;
		int suu = 200;
		
		su = su + 5;
		su = su + 10;
		System.out.println("su의 값: " + su); //115출력
		
		suu = suu + su; //200 + 115
		su = su + suu; // 115 + 315
		System.out.println(suu); // 315출력
		System.out.println(""); 
		
	}

}
