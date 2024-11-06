package sept20_lesson2;

import java.util.Scanner;

public class Study3_sumu {

	public static void main(String[] args) {
		twentyGame();
	}
	
	//일명 스무고개 게임
	//룰: 컴은 1~100 숫자 하나 가짐. 이 수를 내가 6번 이내에 맞추면 승리
	//룰: 네기 슷자를 입력하고 결과 출력할때마다 힌트 메세지 출력
	// 힌트메세지 예) 입력한 숫자가 비밀수보다 작습니다./큽니다.
	
	public static void twentyGame() {
		System.out.println("*** 스무고개 게임을 시작합니다. ***");
		int secretNum = (int)(Math.random()*100+1);
		Scanner s = new Scanner(System.in);
		
		for(int i=1; i<7; i++) {
			System.out.print("1~100 사이의 수를 입력하세요>> ");
			int myNum = s.nextInt();
			System.out.println("==== "+i+"번째 시도입니다 ====");
			
			if(myNum<1 || myNum>101) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				i--;
			} else if(myNum==secretNum) {
				System.out.println("축하합니다. 비밀수를 맞췄습니다!");
			} else if(myNum > secretNum) {
				System.out.println("힌트: 입력한 수가 큽니다.");
			} else System.out.println("힌트: 입력한 수가 작습니다.");
			
			if(i==6) System.out.println("6번 안에 맞추기 실패~~");
		}
	}
	
	public static void twentyGame_() {
		System.out.println("*** 스무고개 게임을 시작합니다. ***");
		int secretNum = (int)(Math.random()*100+1);
		Scanner s = new Scanner(System.in);

		int count = 1;
		while(true) {
			System.out.print("1~100 사이의 수를 입력하세요>> ");
			int myNum = s.nextInt();
			System.out.println("==== "+count+"번째 시도 입니다 ====");
			
			if(myNum<1 || myNum>101) {
				System.out.println("잘못된 입력입니다. 다시입력하세요.");
				count--;
			} else if(myNum==secretNum) {
				System.out.println("축하합니다. 비밀수를 맞췄습니다!");
			} else if(myNum > secretNum) {
				System.out.println("힌트: 입력한 수가 큽니다.");
			} else {
				System.out.println("힌트: 입력한 수가 작습니다.");
			}
			if(count==6) break;
			count++;
			
		}
	}
	
	

}
