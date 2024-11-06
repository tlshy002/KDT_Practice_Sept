package sept20_lesson2;

import java.util.Scanner;

public class Study4_Goal {

	public static void main(String[] args) {
		goalGame();
	}
	
	//승부차기 게임
	// 컴-골키퍼, 나-슈터
	// 슈팅방향과 골키퍼 방향 같으면 노골, 다르면 골인
	// 방향(상,하,좌,우,중) (1,2,3,4,5)
	// 게이머는 슈팅 방향을 입력하고, 컴은 이동방향 선택 (랜덤)

	// 1~5, 난수개수는 5개, 최소 난수는1
	public static void goalGame() {
		System.out.println("****** 승부차기 게임을 시작합니다. ******");
		int goalCount=0; int noGoalCount=0;
		
		for(int i=1; i<6; i++) {
			int goalKeeper = (int)(Math.random()*5+1);
			Scanner s = new Scanner(System.in);
			System.out.println("==== "+i+"번째 시도입니다. ====");
			System.out.print("슈팅방향을 선택하세요. 상(1) 하(2) 좌(3) 우(4) 중(5) >> ");
			int myShoot = s.nextInt();
			
			if(myShoot==goalKeeper) {
				System.out.println("노골입니다.");
				noGoalCount++;
			} else {
				System.out.println("골~~!!");
				goalCount++;
			}		
		}		
		System.out.println("**최종스코어 골인: "+goalCount+", 노골: "+noGoalCount);
	}
	
	
	// 게이머-골키퍼, 컴-슈터
	public static void goalGame_reverse() {
		System.out.println("****** 승부막기 게임을 시작합니다. ******");
		int goalCount=0; int noGoalCount=0;

		int count = 1;
		while(true) {
			System.out.println("==== "+count+"번째 시도입니다. ====");	
			System.out.print("슈팅방향을 선택하세요. 상(1) 하(2) 좌(3) 우(4) 중(5) >> ");
			Scanner s = new Scanner(System.in);
			int goalKeeper = s.nextInt();
			int comShoot = (int)(Math.random()*5+1);
			
			if(goalKeeper==comShoot) {
				System.out.println("슛을 막았습니다~~");
				noGoalCount++;
			} else {
				System.out.println("골을 먹혔습니다ㅠ.ㅠ");
				goalCount++;
			}
			if(count==5) {
				System.out.println("**최종스코어 막은횟수: "+noGoalCount+", 못막은횟수: "+goalCount);
				break;
			}
			count++;
		}
		
	}
	
	
	
}// class===================================================
