package sept12;

public class Study1_tax {

	public static void main(String[] args) {
		howMuch('S', 1000);
		howMuch2('T', 1000);
		howMuch3('A', 1000); //보너스없음
		
		myTax(5000);
	}

	//회사의 업무코드 개발부(S), 영업부(M), 총무부(A), 자재부(T)
	//S->월급의 10% 보너스
	//M->월급의 15% 보너스
	//T->월급의 5% 보너스
	public static void howMuch(char code, int salary) {
		if(code == 'S') {
			double bonus = salary * 0.1;
			System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");
		} else if(code == 'M') {
			double bonus = salary * 0.15;
			System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");
		} else if(code == 'T') {
			double bonus = salary * 0.05;
			System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");
		} else {
			System.out.println("죄송합니다. 보너스가 지급되지 않습니다.");
		}		
	} //howMuch() 끝
	
	/*
	하드코딩 하지말자
	같은내용 반복작성ㄴㄴ
	변수개수를 줄이자
	*/
	
	// 출력 반복작성하는 부분 메서드로 바꾸기
	public static void howMuch2(char code, int salary) {
		double bonus = 0;
		if(code == 'S') {
			bonus = salary * 0.1;
			message(salary, bonus);
		} else if(code == 'M') {
			bonus = salary * 0.15;
			message(salary, bonus);
		} else if(code == 'T') {
			bonus = salary * 0.05;
			message(salary, bonus);
		} else {
			System.out.println("죄송합니다. 보너스가 지급되지 않습니다.");
		}		
	} 
	public static void message(int salary, double bonus) {
		System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");
	}
	
	
	// 출력 반복작성하는 없애고, 출력문에 조건걸기
	public static void howMuch3(char code, int salary) {
		double bonus = 0;
		boolean flag = true;		
		if(code == 'S') {
			bonus = salary * 0.1;
		} else if(code == 'M') {
			bonus = salary * 0.15;
		} else if(code == 'T') {
			bonus = salary * 0.05;
		} else {
			flag = false;
			System.out.println("죄송합니다. 보너스가 지급되지 않습니다.");
		}
		if(flag) {
			System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");
		}
	}
	
	public static void myTax(int salary) {
		double tax = 0;		
		boolean flag = true;
		if(salary < 2000) {
			flag = false;
			System.out.println("납부할 세금이 존재하지 않습니다.");
		} else if(salary < 3500) {
			tax = salary * 0.01; //연봉의 1.0% 세금
		} else if(salary < 4500) {
			tax = salary * 0.015; //연봉의 1.5% 세금
		} else if(salary < 6000) {
			tax = salary * 0.025; //연봉의 2.5% 세금			
		} else {
			tax = salary * 0.035; //연봉의 3.5% 세금		
		}
		if(flag) {
			System.out.println("납부할 세금은: " + tax);
		}
		
		
	}
	
	
	
}
