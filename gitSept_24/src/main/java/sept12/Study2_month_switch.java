package sept12;

public class Study2_month_switch {

	public static void main(String[] args) {
//		showLastDate(9);
//		showLastDateCase(12);
		showLastDateCase2(1);
	}
	
	public static void showLastDateCase2(int month) {
		switch(month) {
		case 2: System.out.println("28일");break; 
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: System.out.println("31일");break;
		default: System.out.println("30일"); //if 문의 else
		}
	}
	
	public static void showLastDate3(int month) {
		switch(month) {
		case 2: System.out.println("28일");break; 
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("30일"); break;
		default: System.out.println("31일");
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
	
	public static void showLastDateCase(int month) {
		switch(month) {
		case 1: System.out.println("31일");break;
		case 2: System.out.println("28일");break;
		case 3: System.out.println("31일");break;
		case 4: System.out.println("30일");break;
		case 5: System.out.println("31일");break;
		case 6: System.out.println("30일");break;
		case 7: System.out.println("31일");break;
		case 8: System.out.println("31일");break;
		case 9: System.out.println("30일");break;
		case 10: System.out.println("31일");break;
		case 11: System.out.println("30일");break;
		case 12: System.out.println("31일");break;
		}
	}
	
	
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
