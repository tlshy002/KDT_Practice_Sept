package sept27_lesson1;


// 자바초등학교 안에 개나리반과 진달래반이 있음
// 개나리반에 김동훈, 한미영
// 진달래반에 오숙희, 이철민
// 모든 학생이 시험을 쳤음 (시험 점수는 0~100사이의 난수)
// 개나리반 쌤이 개나리반학생 시험점수의 합과 평균을 계산하고 출력함
// 진달래반 쌤이 진달래반학생 시험점수의 합과 평균을 계산하고 출력함
// 교장쌤이 모든 학생의 시험점수의 합과 평균을 계산하고 출력함

class JavaSchool {
	JavaSchool() {
		mainTeacher  = new MainTeacher();
		t1 = new TeacherK();
		t2 = new TeacherG();
		classK = new KenariClass();
		classG = new GindalreClass();
	}
	MainTeacher mainTeacher;
	TeacherK t1;
	TeacherG t2;
	KenariClass classK;
	GindalreClass classG;
}



class MainTeacher {
	int totalSum; double totalAve;
	void mainCalculatePrint(TeacherK k, TeacherG g) {
		totalSum = k.sum + g.sum;
		totalAve = totalSum / 2.0;
		System.out.println("전체학생 점수의 합과 평균 "+totalSum+","+totalAve);
	}		
}
class MainTeacher2 {
	int totalSum; double totalAve;
	void mainCalculatePrint(JavaSchool school) {
		int sum = school.classK.kim.score +
				school.classK.han.score +
				school.classG.oh.score +
				school.classG.lee.score;
		
		System.out.println("전체학생 점수의 합과 평균 "+totalSum+","+totalAve);
	}		
}


class TeacherK {
	int sum; double ave;
	void calculatePrint(KimDonghun k, HanMiyoung h) {
		sum = k.score + h.score;
		ave = sum / 2.0;
		System.out.println("개나리반의 합과 평균 "+sum+','+ave);
	}	
	void calculatePrint(KenariClass k) {
		sum = k.kim.score + k.han.score;
		ave = sum / 2.0;
		System.out.println("개나리반의 합과 평균 "+sum+','+ave);
	}	
}

class TeacherG {
	int sum; double ave;
	void calculatePrint(OhShuckhee o, LeeChulmin l) {
		sum = o.score + l.score;
		ave = sum / 2.0;
		System.out.println("진달래반의 합과 평균 "+sum+','+ave);
	}	
}

class KenariClass {
	KenariClass() {
		kim = new KimDonghun();
		han = new HanMiyoung();
	}
	KimDonghun kim;
	HanMiyoung han;
}

class GindalreClass {
	GindalreClass() {
		oh = new OhShuckhee();
		lee = new LeeChulmin();
	}	
	OhShuckhee oh;
	LeeChulmin lee;
}

class KimDonghun {
	KimDonghun(){}
	int score = 0; 
	int doTest() {
		score = (int)(Math.random() * 101);
		return score;
	}
}

class HanMiyoung {
	HanMiyoung(){}
	int score = 0; 
	int doTest() {
		score = (int)(Math.random() * 101);
		return score;
	}
}

class OhShuckhee {
	int score = 0; 
	int doTest() {
		score = (int)(Math.random() * 101);
		return score;
	}
}

class LeeChulmin {
	int score = 0; 
	int doTest() {
		score = (int)(Math.random() * 101);
		return score;
	}
}
	





public class Study5 {
	public static void main(String[] args) {
		
		JavaSchool school = new JavaSchool();
		school.t1.calculatePrint(null);
		
	}
}
