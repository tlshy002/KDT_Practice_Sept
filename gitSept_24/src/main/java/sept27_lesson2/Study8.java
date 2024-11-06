package sept27_lesson2;


// 자바에서의 문자열


public class Study8 {
	// String 클래스의 substring()를 이용해서 문자열 중 특정부분을 골라낸다.
	// 예)010-1234-5678 중에서 5678만 골라내기
	// 예)홍길도 (성+이름)중에서 성만 골라내기
	public static void substringTest() {
		String phoneNumber = "010-1234-5678";
		String num = phoneNumber.substring(9); //메서드 인자로 문자의 위치를 넣기 예)5의위치: 9(0부터시작함)
		System.out.println(num);
		
		String today = "20240927"; // 연월일에서 날짜만 찾기
		String date = today.substring(6);
		System.out.println(date);
		
		//인자가 1개인 substring()은 입력한 인자(시작)부터 끝까지의 범위를 추출함.
		String region = phoneNumber.substring(0, 3);
		
	}
	
	
	
	
	public static void main(String[] args) {
		substringTest();
		
		String str1 = "KOREA";
		String str2 = "KOREA";
		String str3 = new String("KOREA");
		String str4 = new String("KOREA");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		if(str3 == str4) {
			System.out.println("같다");
		} else 
			System.out.println("다르다");
		
		
		if(str2.equals(str4)) { //모든결과 다 같음
			System.out.println("같다");
		} else 
			System.out.println("다르다");
		
		if("KOREA".equals(str4)) { //모든결과 다 같음
			System.out.println("같다");
		} else 
			System.out.println("다르다");
		
		
	}
}
