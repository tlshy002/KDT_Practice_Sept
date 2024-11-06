package sept20_lesson2;

import java.util.Scanner;

public class CafeManagementSystem {
	//클래스 안에 만든 변수 --> 인스턴스 변수
	//클래스 안에 만들고 static 붙인 변수 --> static 변수
	//메서드 안에 만든 변수 --> 지역변수

	public static void main(String[] args) { //매개변수, 인자=인수
		while(true) {
			mainMenu();
			if(mainNum==9) {
				System.out.println("종료합니다.");
				break;
			} else if(mainNum==1) {
				coffeeMenu();
			} else if(mainNum==2) {
				teaMenu();
			}
		}
	}

	static Scanner s = new Scanner(System.in);
	static int mainNum = 0; 
	static int coffeeSubMenuNum = 0;
	static int money = 0; //주문한 커피 가격을 저장
	static int quantityNum = 0;

	public static void mainMenu() { //음료수 주문관리 시스템
		System.out.println("****************************");
		System.out.println("*   카페주문관리 시스템 ver1.0   *");
		System.out.println("*                          *");
		System.out.println("* 1.커피주문                  *");
		System.out.println("* 2.차 주문                  *");
		System.out.println("*                          *");
		System.out.println("* 9.시스템종료                *");
		System.out.println("****************************");
		System.out.print("원하시는 번호를 입력하고 Enter를 누르세요>> ");
		mainNum = s.nextInt();
	}
	
	public static void coffeeMenu() {
		coffeeSubMenu();
		switch(coffeeSubMenuNum) {
		case 1: money=1000; quantity(); showTotal(); break;
		case 2: money=1500; quantity(); showTotal(); break;
		case 3: money=3000; quantity(); showTotal(); break;
		case 4: money=2500; quantity(); showTotal(); break;
		}
	}
	
	public static void coffeeSubMenu() {
		System.out.println("1. 아메리카노: 1,000원");
		System.out.println("2. 에스프레소: 1,500원");
		System.out.println("3. 카페모카: 3,000원");
		System.out.println("4. 카페라떼: 2,500원");
		System.out.println();
		System.out.println("9. 메인 메뉴로");
		System.out.print("원하시는 번호를 입력하고 Enter를 누르세요>> ");
		coffeeSubMenuNum = s.nextInt();
	}

	public static void quantity() {
		System.out.print("원하시는 수량을 입력하고 Enter를 누르세요>> ");
		quantityNum = s.nextInt();
	}
	
	public static void showTotal() {
		System.out.println("주문총액은 "+ (money*quantityNum) +"입니다.");
		System.out.println("주문해주셔서 감사합니다~~");
		System.out.println();
	}
	
	//------------------------------------------------------------------------------------
	
	public static void teaMenu() {
		teaSubMenu();
		switch(teaNum) {
		case 1: money=1000; teaQuantity(); showTeaPrice(); break;
		case 2: money=3000; teaQuantity(); showTeaPrice(); break;
		case 3: money=1500; teaQuantity(); showTeaPrice(); break;
		case 4: money=2000; teaQuantity(); showTeaPrice(); break;
		}
		
	}
	
	static int teaNum = 0;
	static int teaQuantityNum = 0;
	
	public static void teaSubMenu() {
		System.out.println("1. 녹차(1,000원)");
		System.out.println("2. 홍차(3,000원)");
		System.out.println("3. 보리차(1,500원)");
		System.out.println("4. 둥글레차(2,000원)");
		System.out.println();
		System.out.println("1~4제외 다른 번호. 메인 메뉴로");
		System.out.print("원하시는 차의 번호를 입력하고 Enter를 누르세요>> ");
		teaNum = s.nextInt();
		
	}
	public static void teaQuantity() {
		System.out.print("원하시는 수량을 입력하고 Enter를 누르세요>> ");
		teaQuantityNum = s.nextInt();
	}
	public static void showTeaPrice() {
		int price = money*teaQuantityNum;
		System.out.println("가격은 총 "+ price +"원 입니다.");
		System.out.println("주문해주셔서 감사합니다~~");
		System.out.println();
	}
	
	


} //class=============================================================
