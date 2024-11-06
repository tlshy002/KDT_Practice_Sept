package sept12;

public class Study3_grade_switch {

	public static void main(String[] args) {
		gradeCase(89);
		howMuchCase('s', 10000);
	}
	
	
	public static void howMuchCase(char code, int salary) {
		double bonus = 0; boolean flag = true;
		switch(code) {
		case 'S': bonus = salary * 0.1;break;
		case 'M': bonus = salary * 0.15;break;
		case 'T': bonus = salary * 0.05;break;
		default: System.out.println("죄송합니다. 보너스가 지급되지 않습니다."); flag = false;
		}
		//보여줄지말지 선택하는건(TorF) 스위치로 안됨
		if(flag) {
			System.out.println("당신의 월급은 "+salary+"원이고, 보너스는 "+bonus+"원 입니다");			
		}
	}
	
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
	
	
	
	
	//스위치로 범위 처리하는법. 약간의 트릭
	public static void gradeCase(int score) {
		switch(score/10) {
		//A:90~100
		case 10:
		case 9: System.out.println("당신은 A");break;
		case 8: System.out.println("당신은 B");break;
		case 7: System.out.println("당신은 C");break;
		case 6: System.out.println("당신은 D");break;
		default: System.out.println("당신은 F");
		
		}
	}
	
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
