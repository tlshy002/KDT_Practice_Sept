package sept09;

public class Study2 {

	public static void main(String[] args) {
		//compareOP(100, 90);
		exam(70);
	}
	
	public static void gavaboResult(int chu,int min) {
		System.out.println(chu==min); //true 이면 무승부
		
		//가위로 이기는 경우, 민수는 보=3
		System.out.println((chu==1) && (min==3)); //true 이면 이김
		
		//바위로 이기는 경우, 민수는 가위=1
		System.out.println((chu==2) && (min==1)); //true 이면 이김
		
		//보로 이기는 경우, 민수는 바위=2
		System.out.println((chu==3) && (min==2)); //true 이면 이김
		
		//즉, true 가 나오면 비긴경우이거나 이긴경우이다. false 는 무조건 패배
		
		
		
	}
	
	// exam(점수) 메소드 만들기. T면 pass F는 논패 
	public static void exam(int score) {
		System.out.println(score >= 60);// 60보다크면 true 
	}
	
	
	
	
	// 가위=1 바위=2 보=3
	public static void gavabo(int minsu,int babo) {
		if(minsu == babo) {
			System.out.println("비겼습니다.");
		}
		if(minsu==1) { // 민수가 가위일때
			
		}
		
	}
	
	public static void compareOP(int a, int b) {
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

}
