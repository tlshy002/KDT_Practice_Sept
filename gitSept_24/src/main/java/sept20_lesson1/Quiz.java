package sept20_lesson1;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		game();
	}
	

	
	//퀴즈) 7전 4승제의 가바보 (무한or유한) 
	static int gamerWin = 0; static int comWin = 0;
	public static void game() {
		for(int i=1; i<=7; i++) {
			System.out.println("***** 제 "+i+"회 게임 *****");
			gavabo();
			if(gamerWin==4 || comWin==4) {
				System.out.println("4번 승리했습니다. 게임종료"+ gamerWin +"," + comWin);
				System.out.println("4번 승리했습니다. 게임종료"+ gamerWin +"," + comWin);
				break;
			} 
//			else if() { // ++추가) 3승3무, 3승2무, 2승4무 종료
//				
//			} else if() {
//				
//			}
		}
		System.out.println("7번 게임끝");
		
		
	}
	
	public static void gavabo() {
		Scanner s = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3)를 입력하고 Enter를 누르세요>> ");
		int gamer = s.nextInt();
		int com = (int)(Math.random()*3+1);
		
		if(gamer==com) {
			System.out.println("무승부");
		} else if( gamer==1&&com==3 || gamer==2&&com==1 || gamer==3&&com==2 ) {
			System.out.println("님이 이김");
			gamerWin++;
		} else {
			System.out.println("컴이 이김"); 
			comWin++;
		}
	}
	
	
} //class====================
