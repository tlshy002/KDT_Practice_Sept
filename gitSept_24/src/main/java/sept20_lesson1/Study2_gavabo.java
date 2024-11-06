package sept20_lesson1;
import java.util.Scanner;




//강사님.ver
public class Study2_gavabo {

	public static void main(String[] args) {
		gavabo2Win2draw_2();
	}
	
	
	
	static int gamerWin=0; static int comWin=0; static int drawCount=0;
	
	public static void gavabo2Win2draw() { //5판중 2승2무이거나 3승이면 종료.ver1
		for(int i=1; i<=5; i++) {
			System.out.println("********* 제 "+i+"회 게임 *********");
			gavaboGameVoid();
			if(gamerWin==3 ||comWin==3) {
				System.out.println("누가 먼저 3번 이겼음. 게임을 종료합니다.");
				break;
			} else if( gamerWin==2&&drawCount==2 || comWin==2&&drawCount==2 ) {
				System.out.println("2승 2무로 끝났습니다.");
				break;
			}			
		}		
	}
	
	public static void gavabo2Win2draw_2() { //ver2
		int count=1;
		while(true) {
			System.out.println("********* 제 "+count+"회 게임 *********");
			gavaboGameVoid();
			if(gamerWin==3 ||comWin==3) { // 누구든지 3승 종료
				System.out.println("누가 먼저 3번 이겼음. 게임을 종료합니다.");
				break;
			} else if( gamerWin==2&&drawCount==2 || comWin==2&&drawCount==2 ) {
				System.out.println("2승2무로 끝났습니다.");
				break;
			} else if(count==5) break; //5판되면 종료
			count++;
		}		
		
		
	}//---------------------------------------------------------------------------
	
	
	
	public static void gavabo3win() { //5판중 누군가 3승만 하면 게임끝.ver1
		//이긴횟수를 저장하기 위한 변수필요 --> 게이머가 이긴횟수, 컴이 이긴횟수
		//변수를 만들어야 하는데 변수를 만들수 있는 위치 --> 메서드 안, 클래스 안
		int count = 1;
		while(true) {
			System.out.println("********* 제 "+count+"회 게임 *********");
			gavaboGameVoid();
			if(gamerWin==3 ||comWin==3) {
				System.out.println("누가 먼저 3번 이겼음. 게임을 종료합니다.");
				break;
			} else if(count==5) break; //5판되면 종료
			count++;
		}		
	}
	public static void gavabo3win_2() { //ver2
		for(int i=1; i<=5; i++) {
			System.out.println("********* 제 "+i+"회 게임 *********");
			gavaboGameVoid();
			if(gamerWin==3 ||comWin==3) {
				System.out.println("누가 먼저 3번 이겼음");
				break;
			}
		}
	}//-------------------------------------------------------------------------------
	
	
	
	public static void gavabo5to3() { //5판 게임
		//유한반복
		for(int i=1; i<6; i++) {
			System.out.println("********* 제 "+i+"회 게임 *********");
			gavaboGameVoid();
		}		
		//무한반복에 break
		int count = 1; //게임횟수
		while(true) {
			System.out.println("********* 제 "+count+"회 게임 *********");
			gavaboGameVoid();
			if(count==5) break;
			count++;
		}		
	}
	
	
	
	
	public static void gavaboGameVoid() {
		Scanner s = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하고 Enter를 누르세요 : ");
		int gamer = s.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(gamer==com) {
			System.out.println("무승부"); drawCount++;
		} else if( (gamer==1&&com==3) || (gamer==2&&com==1) || (gamer==3&&com==2) ) {
			System.out.println("님이 이김"); gamerWin++;
		} else {
			System.out.println("컴이 이김"); comWin++;
		}
	}

} //class===================================================================
