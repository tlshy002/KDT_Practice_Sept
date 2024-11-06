package sept25;



//사람클래스를 만들고 정수,민아,용우를 각각 만드는 방식으로하면 SRP를 위반함
//시험점수는 각각 85,90.95점
//강사가 가장높은 점수를 출력함
//학생들이 시험을 보기전에는 모두 0점

class Jungsoo {
	Jungsoo(){}
	int record = 0;
	void doTest() {
		record = 85;
	}
}
class Mina {
	Mina(){}
	int record = 0;
	void doTest() {
		record = 90;
	}
	
}
class Youngu{
	Youngu(){}
	int record = 0;
	void doTest() {
		record = 95;
	}
}
class Teacher {
	Teacher(){}
	
	int max = 0; int sum = 0; int ave= 0;
	void calculate(Jungsoo js, Mina mi, Youngu yu) {//인스턴스를 인자로 받음
		//합과 평균
		sum = js.record + mi.record + yu.record;
		ave = sum/3;

		//비교 계산
		if(js.record > mi.record) {
			if(js.record > yu.record) {
				max = js.record; //정수의 점수가 가장큼
			} else max= yu.record; //용우의 점수가 가장큼
		} else if(mi.record > yu.record) { //정수보다 민아가 큼
			max = mi.record;
		} else max = yu.record;
	}
	
	void showResult() {
		System.out.println("세학생 점수 합: "+sum);
		System.out.println("세학생 점수 평균: "+ave);
	}	
	void showTop() {		
		System.out.println("세학생중 가장 점수가 높은 점수는: "+max);
	}
}



public class Study2 {
	public static void main(String[] args) {
		Jungsoo js = new Jungsoo();
		Mina mi = new Mina();
		Youngu yu = new Youngu();
		Teacher t = new Teacher();
		
		js.doTest(); mi.doTest(); yu.doTest();
		
		t.calculate(js, mi, yu);
		t.showResult();
		t.showTop();
		
		
		
		
		System.out.println(mi.record);
		
		
		
	}
}
