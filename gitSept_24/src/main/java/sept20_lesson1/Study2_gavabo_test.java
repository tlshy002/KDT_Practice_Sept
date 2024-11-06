package sept20_lesson1;
import java.util.Scanner;



//이건 내가 테스트용으로 할거
public class Study2_gavabo_test {

	public static void main(String[] args) {
		gavabo5to3();
	}
	
	public static void gavabo3win() { 
		//이긴횟수를 저장하기 위한 변수필요 --> 게이머가 이긴횟수, 컴이 이긴횟수
		//변수를 만들어야 하는데 변수를 만들수 있는 위치 --> 메서드 안, 클래스 안
		int count = 1;
		int gamerWin = 0;
		int comWin = 0;
		while(true) {
			
			
			if(gamerWin+comWin>=3) {
				//if()
			}
		}
		
	}
	
	
	
	public static void gavabo5to3() { //5판 3승 게임
		//5번 유한반복
		for(int i=1; i<6; i++) {
			System.out.println("********* 제 "+i+"회 게임 *********");
			gavaboGameVoid();
		}		
		//무한반복
		int count = 1; //게임횟수
		while(true) {
			System.out.println("********* 제 "+count+"회 게임 *********");
			gavaboGameVoid();
			if(count==5) break;
		}		
	}
	
	
	public static int gavaboGame() {
		Scanner s = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하고 Enter를 누르세요");
		int gamer = s.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(gamer==com) {
			System.out.println("무승부");
			return 0;
		} else if( (gamer==1&&com==3) || (gamer==2&&com==1) || (gamer==3&&com==2) ) {
			System.out.println("님이 이김");
			return 1;
		} else {
			System.out.println("컴이 이김");
			return 0;
		}
	}
	public static void gavaboGameVoid() {
		Scanner s = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하고 Enter를 누르세요");
		int gamer = s.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(gamer==com) {
			System.out.println("무승부");
		} else if( (gamer==1&&com==3) || (gamer==2&&com==1) || (gamer==3&&com==2) ) {
			System.out.println("님이 이김");
		} else {
			System.out.println("컴이 이김");
		}
	}

} //class===================================================================
