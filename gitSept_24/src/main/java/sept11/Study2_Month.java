package sept11;

public class Study2_Month {

	public static void main(String[] args) {
		showLastDate(12);
		showLastDate2(12);
		showLastDate2(12);
	}
	
	public static void showLastDate3(int month) {
		if(month < 1 && month > 12) {
			System.out.println("존재하지 않는 달입니다.");
		} else {
			if(month == 2) {
				System.out.println("28일");
			} else if(month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("30일");
			} else {
				System.out.println("31일");
			}
		}
	}
	
	public static void showLastDate2(int month) {
		if(month < 1 && month > 12) {
			System.out.println("존재하지 않는 달입니다.");
		} else {
			if(month == 2) {
				System.out.println("28일");
			} else if(month == 1 || month == 3 || month == 5 || month == 7 || 
					month == 8 || month == 10 || month == 12) {
				System.out.println("31일");
			} else {
				System.out.println("30일");
			}
		}
	}
	

	//1월부터 12까지 달이 있음. 특정 달을 입력하면 해당 달의 마지막 날을 출력하는 메서드
	public static void showLastDate(int month) {
		if(month < 1 && month > 12) {
			System.out.println("존재하지 않는 달입니다.");
		} else {
			if(month == 1) {
				System.out.println("31일");
			} else if(month == 2) {
				System.out.println("28일");
			} else if(month == 3) {
				System.out.println("31일");
			} else if(month == 4) {
				System.out.println("30일");
			} else if(month == 5) {
				System.out.println("31일");
			} else if(month == 6) {
				System.out.println("30일");
			} else if(month == 7) {
				System.out.println("31일");
			} else if(month == 8) {
				System.out.println("31일");
			} else if(month == 9) {
				System.out.println("30일");
			} else if(month == 10) {
				System.out.println("31일");
			} else if(month == 11) {
				System.out.println("30일");
			} else {
				System.out.println("31일");
			}		
		
		}		
	}

	
	
	
	
}
