package sept25;


//영희가 멀리뛰기함. 기록은 123.3
//민영이 멀리뛰기함. 기록은 103.5
//수영이 멀리뛰기함. 기록은 113.5
//민철이: 영희와 민영, 수영의 기록의 합과 평균을 출력함
//*주의 멀리뛰기를 하기 전에 멀리뛰기기록은 0



class Person {
	Person(){}
	
	double record = 0;
	void jump(double record) {
		this.record = record;
	}	
}

class Person_cal {
	Person_cal(){}
	
	double sum =0; double average = 0;
	void calculate(double a, double b, double c) {
		sum = a+b+c;
		average = sum/3;
	}
	void showResult() {
		System.out.println("세사람의 기록 합은: "+sum);
		System.out.println("세사람의 기록 평균은: "+average);
	}
	
}



public class Study1_2 {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		
		Person p1 = new Person();
		System.out.println(p1.record);
		p1.jump(123.3);
		System.out.println(p1.record);
		
	}
}
