package sept12;

public class Study4 {

	public static void main(String[] args) {

//		showPriceIf(61);
		showPriceCase(60);
		showPriceCase(61);
	}

	public static void showPriceIf(int age) {
		int price = 0;
		if(age < 20) {
			price = 1000;
		} else if (age <= 60) {
			price = 5000;			
		} else {
			price = 2000;			
		}
		System.out.println("공원 입장료는 " + price + "입니다.");		
	}
	
	
	//청소년(~19) 1000원, 성인(20~60) 5000원, 노약자(61~) 2000원
	public static void showPriceCase(int age) {
		int price = 0;
		switch(age/10) {
		case 0: 
		case 1: price = 1000;break;
		case 2: 
		case 3: 
		case 4: 
		case 5: price = 5000;break;
		case 6: if(age == 60) { price = 5000; } //60살까지만 5천원 61이상부터 2천원
				else { price = 2000; }break;
		default: price = 2000;
		}
		System.out.println("공원 입장료는 " + price + "입니다.");
		
		
//		if(age > 60) {
//			 System.out.println("공원 입장료는 2000원입니다.");
//		} else if (age == 60) {
//			System.out.println("공원 입장료는 2000원입니다.");
//			
//		}
//		
		
 	}
	
	
}
