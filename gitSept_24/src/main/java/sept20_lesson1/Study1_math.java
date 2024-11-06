package sept20_lesson1;

public class Study1_math {

	public static void main(String[] args) {
		makeRandom();
		randomDice();
		gavabo();
		randomScore();
		randomLucky();
	}
	
	// 행운의 수 두자리 랜덤으로 하기
	// 10~99 --> 난수의 개수 90개
	// 1단계: 난수 개수 곱함 Math.random()*90
	// 2단계: 가장작은 난수를 더함 	Math.random()*90 +10
	// 3단계: 정수로 바꿈
	public static void randomLucky() {
		int luckyNum = (int)(Math.random()*90+10);
		System.out.println("행운의수: "+luckyNum);
	}
	
	public static void makeRandom() {
		double random = Math.random();
		System.out.println("생성된 난수: "+ random);
		
	}
	
	//기본 랜덤함수는 더블형인데, 어떻게 정수형으로 바꿀까
	//주사위 난수 필요(1~6)
	// 0.0<  <1.0  1단계:난수 범위에 6을 곱해준다 (난수의 개수를 곱함)
	// 0.0<  <6.0  2단계:거기에 +1해준다 (가장작은 난수를 더함)
	// 1.0<  <7.0  3단계:정수형으로 캐스팅
	// 1<  <7
	public static void randomDice() {
		int dice = (int)((Math.random()*6)+1);
		//int dice2 = (int)((Math.random()+1)*6);
		System.out.println("생성된 주사위 난수: "+dice);
	}
	
	public static void gavabo() {
		int gavabo = (int)(Math.random()*3+1);
		System.out.println("가바보: "+gavabo); //1~3까지 랜덤
	}

	public static void randomScore() { 
		int score = (int)(Math.random()*101);//가장작은 난수가 0이니까 안더함
		System.out.println("당신의 점수: " +score); //0~100까지 랜덤
	}
	
}
