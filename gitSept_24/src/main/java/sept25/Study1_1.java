package sept25;

// sept24 Study4 --> 강사님 답
//영희가 멀리뛰기함. 기록은 123.3
//민영이 멀리뛰기함. 기록은 103.5
//수영이 멀리뛰기함. 기록은 113.5
//민철이: 영희와 민영, 수영의 기록의 합과 평균을 출력함
//*주의 멀리뛰기를 하기 전에 멀리뛰기기록은 0

class YoungHee {
	YoungHee() {}
	double record = 0;
	void jump() {
		record = 123.3;
	}	
}
class MinYoung {
	MinYoung() {}
	double record = 0;
	void jump() {
		record = 103.5;
	}	
}
class Suyoung {
	Suyoung() {}
	double record = 0;
	void jump() {
		record = 113.5;
	}	
}
class Minchul {
	Minchul(){}
	double sum = 0; double average = 0;
	
	void calculate(YoungHee yh, MinYoung my, Suyoung sy) {
		sum = yh.record + my.record + sy.record;
		average = sum/3;
	}
	void showResult() {
		System.out.println("멀리뛰기의 합: "+sum);
		System.out.println("멀리뛰기의 평균: "+average);
	}
}
class Human {
	
}

class A {
	
}


public class Study1_1 {
	public static void main(String[] args) {
		YoungHee y = new YoungHee();
		MinYoung m = new MinYoung();
		Suyoung s = new Suyoung();
		y.jump(); m.jump(); s.jump(); //멀리뛰기를 했다.
		
		Minchul mc = new Minchul();
		mc.calculate(y, m, s);
		mc.calculate(new YoungHee(), new MinYoung(), new Suyoung());
		mc.showResult();
		
		
		//---------------------------------
		
		A a1 = new A();
		A a2 = new A();
		A a3 = a1;
		if(a1 == a2) {
			System.out.println("a1과 a2는 같다");
		} else 
			System.out.println("a1과 a2는 다르다");	 //다르다
		
		int b1 = 100;
		int b2 = 100;
		int b3 = b1;
		if(a1 == a3) {
			System.out.println("a1과 a3는 같다"); //같다
		} else 
			System.out.println("a1과 a3는 다르다");
		

		
	}
}
