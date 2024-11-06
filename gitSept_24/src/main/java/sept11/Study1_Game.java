package sept11;

public class Study1_Game {

	public static void main(String[] args) {
		luckyLotto(91);
		
		grade(-1);
		
		max1(1,50,3);
		max2(1,50,3);
		
		min1(2, -5, 100);
		min2(2, -5, 100);
	}
	
	
	// 복권당첨 게임 : 컴퓨터가 두자리 수를 가짐
	// 행운수 2개를 맞추면 1등
	// 앞뒤 자리가 바뀐 수이면 2등 예) 행운수 49인데 94입력
	// 앞뒤 자리 중 하나 맞추면 3등
	public static void luckyLotto(int gamerNum) {
		int luckyNum = 59;
		
		int luckyFront = luckyNum / 10;
		int luckyBack = luckyNum % 10;
		int frontNum = gamerNum / 10;
		int backNum = gamerNum % 10;
		
		System.out.println(luckyFront +","+ luckyBack +","+ frontNum +","+ backNum);
		

		
		if(gamerNum > 99 || gamerNum < 10) {
			System.out.println("입력값은 두자리 수만 가능합니다.");
		} else if(luckyNum == gamerNum) {
			System.out.println("축하 1등");
		} else if( luckyFront==backNum && luckyBack==frontNum ) {
			System.out.println("축하 2등임");			
		} else if( luckyFront==frontNum || luckyBack==backNum ||
				luckyFront==backNum || luckyBack==frontNum) {
			System.out.println("축하 3등임");			
		} else {
			System.out.println("꽝입니다!!!");
		}
		
	}
	
	
	//3개의 수 중에서 가장 큰 수를 찾는 메서드
	public static void max1(int num1, int num2, int num3) {
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + "이 가장 큰수이다.");
			} else {
				System.out.println(num3 + "이 가장 큰수이다.");
			}
		} else if(num2 > num3) {
			System.out.println(num2 + "이 가장 큰수이다.");
		} else {
			System.out.println(num3 + "이 가장 큰수이다.");
		}
	}
	public static void max2(int num1, int num2, int num3) {
		if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + "이 가장 큰수이다.");
			
		} else if((num2 > num1) && (num2 > num3)) {
		System.out.println(num2 + "이 가장 큰수이다.");
		
		} else {
		System.out.println(num3 + "이 가장 큰수이다.");
		}
	}
	
	public static void min1(int num1, int num2, int num3) {
		if(num1 < num2) {
			if(num1 < num3) {
				System.out.println(num1 + "이 가장 작은 수이다.");				
			} else {
				System.out.println(num3 + "이 가장 작은 수이다.");								
			}
		} else { //num2가 더 작음
			if(num2 < num3) {
				System.out.println(num2 + "이 가장 작은 수이다.");												
			} else {
				System.out.println(num3 + "이 가장 작은 수이다.");																
			}
		}
	}
	
	public static void min2(int num1, int num2, int num3) {
		if((num1 < num2) && (num1 < num3)) {
			System.out.println(num1 + "이 가장 작은 수이다.");
		} else if(num2 < num3) {
			System.out.println(num2 + "이 가장 작은 수이다.");
		} else {
			System.out.println(num3 + "이 가장 작은 수이다.");			
		}
	}
	
	
	

	//학점 출력 메서드 : 입력한 점수에 따라 A~F까지 학점출력
	public static void grade(int score) {		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
		} else if(score >= 90) {
			System.out.println("당신은 A");
		} else if(score >= 80) {
			System.out.println("당신은 B");
		} else if(score >= 70) {
			System.out.println("당신은 C");
		} else if(score >= 60) {
			System.out.println("당신은 D");
		} else {
			System.out.println("당신은 F");
		}		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
