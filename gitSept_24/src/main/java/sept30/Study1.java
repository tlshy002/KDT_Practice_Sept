package sept30;


// String 클래스에 선언된 equals, substring 외의 다른 메서드

public class Study1 {	
	public static void main(String[] args) {
		stringMethod();
	}
	
	public static void stringMethod() {
		String text1 = "Hello Java String";
		String text2 = "HELLO Java String";
		char result1 = text1.charAt(2); //2번째 위치의 문자
		System.out.println(result1);
		
		String result2 = text1.concat("s"); //끝에 문자 추가
		System.out.println(result2);
		
		boolean result3 = text1.contains("and"); //text1에 "and"포함하는지?
		System.out.println(result3);
		
		boolean result4 = text1.equals(text2); 
		System.out.println(result4);
		
		int result5 = text1.indexOf("a"); //text1 에서 "a"의 위치 => 7
		System.out.println(result5);
		
		
		int result6 = text1.lastIndexOf("a"); // indexOf 와 lastIndexOf 는 비슷한데 last 는 뒤에서부터 찾음 =? 9
		System.out.println(result6);
		
		String result7 = text1.trim(); //양쪽의 쓸데없는 공백 제거
		System.out.println(result7);
		
		int result8 = text1.length(); //글자 길이 출력 => 17
		System.out.println(result8);
		
		String result9 = text1.substring(7); // 7부터 출력 => ava String 출력
		System.out.println(result9);
		
		String result10 = text1.substring(7,11); // 7부터~11까지 => ava 출력
		System.out.println(result10);
		
		String result11 = text2.replace(" ", "-"); // 빈칸을 -로 대체
		System.out.println(result11);
		
		String result12 = text1.toUpperCase(); //대문자로
		System.out.println(result12);
		
		String result13 = text2.toLowerCase(); //소문자
		System.out.println(result13);
		
		String[] result14 = text1.split(" "); //공백을 기준으로 잘라서, 잘라진 각각을 배열에 넣고 출력
		for(int i=0; i<result14.length; i++) {
			System.out.println(result14[i]);
		}
		
	}
	
	
	
}
