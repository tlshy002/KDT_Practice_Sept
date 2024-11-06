package sept06;

public class Study4 {

	public static void main(String[] args) {
		double sinjang = 173.5;
		double momuge = 53.1;
		showStadardWeight(sinjang, momuge);		
		showSizeOfRactangle(105, 55.5);
		showSizeOfTriangle(105, 55.5);
		
		double result = showSizeOfRactangle2(105, 55.5);
		System.out.println("사각형의 면적을 구하는 리턴메서드의 결과 : " + result); 
	}
	
	public static void showStadardWeight(double sinjang, double momuge) {
		//신장과 몸무개를 통해 표준체중을 출력하는 메서드 작성
		//표준체중 공식 = (신장 - 100) * 0.9
		//예) 신장:173.5m, 몸무게:85.1;
		double result = (sinjang -100) * 0.9;
		System.out.println("당신의 현재 체중은 " +momuge+ "kg, 표준체중은 " +result+ "kg");
	}
	
	public static double showSizeOfRactangle2(double width, double height) {
		double result = width * height;
		System.out.println("가로" +width+ ", 세로" +height+ "의 면적은 " +result+ "입니다.");
		return result;
	}
	
	public static void showSizeOfRactangle(double width, double height) {
		double result = width * height;
	}
	
	public static void showSizeOfTriangle(double width, double height) {
		double result = width * height / 2;
		System.out.println("가로" +width+ ", 세로" +height+ "의 면적은 " +result+ "입니다.");
	}
	

	
	
	
}
