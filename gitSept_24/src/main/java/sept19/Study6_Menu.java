package sept19;

import java.util.Scanner;

public class Study6_Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			menu();
			int num = s.nextInt();
			if(num == 1) goLuckyNum();
			else if(num == 2) goGrade();
			else if(num == 3) exchange();
			else if(num == 4) makeTree();
			else if(num == 9) break;
		}
		System.out.println("이용해주셔셔 감사링");
	}
	
	public static void menu() {
		System.out.println("*********************");
		System.out.println("1. 복권당첨 게임");
		System.out.println("2. 학점출력");
		System.out.println("3. 환전");
		System.out.println("4. 트리그리기");
		System.out.println();
		System.out.println("9. 종료");
		System.out.print("원하시는 번호를 입력하고 Enter를 누르세요.");
		
	}
	
	public static void goLuckyNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("두자리 숫자를 입력하고 Enter를 누르세여");
		int gamerNum = s.nextInt();
		int gamerFront = gamerNum / 10; //입력받은 수의 앞자리
		int gamerBack = gamerNum % 10; //입력받은 수의 뒷자리

		int luckyNum = (int)(Math.random()*90+10);
		int luckyFront = luckyNum / 10;
		int luckyBack = luckyNum % 10;
		
		if(luckyNum==gamerNum) {
			System.out.println("축하링 1등임다");
		} else if(luckyFront==gamerBack && luckyBack==gamerFront) {
			System.out.println("축하링 2등임다");
		} else if(luckyFront==gamerFront || luckyBack==gamerBack 
				|| luckyFront==gamerBack || luckyBack==gamerFront) {
			System.out.println("축하링 3등임다");
		} else System.out.println("다음기회에... 행운의 수는 "+luckyNum+"이었습니다~");
	}
	
	public static void goGrade() {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하고 Enter를 누르셈");
		int score = s.nextInt();
		switch(score/10) {
		case 10: case 9: System.out.println("A학점입니다."); break;
		case 8: System.out.println("B학점입니다."); break;
		case 7: System.out.println("C학점입니다."); break;
		case 6: System.out.println("D학점입니다."); break;
		default: System.out.println("F학점입니다. 재수강하셈"); break;
		}
	}
	
	public static void exchange() {
		Scanner s = new Scanner(System.in);
		System.out.println("환전이 필요한 금액을 입력하고 Enter를 누르세요");
		int money = s.nextInt();
		int oman = money / 50000;
		int namuge = money % 50000; 
		int man = namuge / 10000;
		namuge = namuge % 10000;
		int ochun = namuge / 5000;
		namuge = namuge % 5000;
		int chun = namuge / 1000;
		namuge = namuge % 1000;
		int oback = namuge / 500;
		namuge = namuge % 500;
		int back = namuge / 100;
		System.out.println("환전금액은>> 오만원권 "+oman+"장, 만원권 "+man+"장, 오천원권 "+ochun+"장, 천원권 "+chun+"장, 오백원 "+oback+"개, 백원"+back+"개 입니다.");
	}
	
	public static void makeTree() {
		Scanner s = new Scanner(System.in);
		System.out.println("나무의 높이를 입력하고 Enter를 누르세여.");
		int height = s.nextInt();
		drowTree(height);
	}
	
	public static void drowTree(int height) {
		int nopi = 1;
		while(nopi<height+1) {
			int star = 1;
			while(star<=nopi) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			nopi++;
		}
		
		//		for(int i=0; i<height+1; i++) {
//			for(int j=0; ;) {
//				
//			}
//		}
	}
	
	

} //class=========================================================
