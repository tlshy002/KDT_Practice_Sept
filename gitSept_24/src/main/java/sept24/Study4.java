package sept24;


//영희가 멀리뛰기함. 기록은 123.3
//민영이 멀리뛰기함. 기록은 103.5
//수영이 멀리뛰기함. 기록은 113.5
//민철이: 영희와 민영, 수영의 기록의 합과 평균을 출력함
//*주의 멀리뛰기를 하기 전에 멀리뛰기기록은 0

class People {
	double meter = 0;	
}

class Min {
	double sum(double a, double b, double c) {
		double sum = a+b+c;
		return sum;
	}
	double average(double sum) {
		double result = sum/3;
		return result;
	}
	void showCalculate(double sum, double average) {
		System.out.println("* 세사람 기록의 합은 "+sum+", 기록의 평균은 "+average);
	}
	
}

class Person {
	Person(int a) {
		a = 15;
	}
	void test1(int a) {
		//test
	}
}





public class Study4 {
	public static void main(String[] args) {
		
		People yeonghe = new People();
		People minyeong = new People();
		People suyeong = new People();
		
		double scoreY = yeonghe.meter;
		double scoreM = minyeong.meter;
		double scoreS = suyeong.meter;
		
		System.out.println("***멀리뛰기 시작합니다***");
		System.out.println();
		System.out.print("영희기록: "+scoreY+"m	|");
		System.out.print("민영기록: "+scoreM+"m	|");
		System.out.println("수영기록: "+scoreS+"m	");
		System.out.println("시작!");	
		
		scoreY = 123.3;
		scoreM = 103.5;
		scoreS = 113.5;
		System.out.print("영희기록: "+scoreY+"m	|");
		System.out.print("민영기록: "+scoreM+"m	|");
		System.out.println("수영기록: "+scoreS+"m	");
		
		Min m = new Min();
		double resultSum = m.sum(scoreY, scoreM, scoreS);
		double resultAverage = m.average(resultSum);
		System.out.println();
		m.showCalculate(resultSum, resultAverage);
	}
}
