package sept30;

// 가상의 학생 20명 생성
// 학생 속성: 이름,토익점수


class MakingStu {
	MakingStu(){}
	String[] familyName = {"김","이","박","최","정","현","조","추","고","문","신","유","우","양","하","한"};
	String[] surName = {"서준","미영","종현","현정","정수","민","영현","종철","민수","영철","철민","현영","영미","준석","영아"};
	
	Student[] students = new Student[20]; //인스턴스 20개 저장할 배열생성
	
	// max 를 findMax()와 findMaxScoreName()에서 접근하도록 인스턴스변수로 선언
	int max;
	void findMaxScoreName() {
		for(int i=0; i<20; i++) {
			if(max == students[i].toeic) {
				System.out.println("최고점수 학생이름: "+ students[i].name);
			}
		}
		
	}
	
	// students 배열에있는 20개의 Student 인스턴스 안의 토익점수 중 가장큰값 출력
	void findMax() {
		max = students[0].toeic;
		for(int index=1; index<20; index++) {
			if(max < students[index].toeic) 
				max = students[index].toeic;
		}
		System.out.println("최고점수: " + max);		
	}
	
	void twentyStudents() {
		// 20개 인스턴스 생성을 위해 20번 반복
		for(int i=0; i<20; i++) {
			students[i] = makeStu();
		}
		for(int i=0; i<20; i++) {
			System.out.println(i+1+") 학생이름: "+students[i].name+", 토익점수: "+students[i].toeic);
		}
	}
	
	
	Student makeStu() {
		String name = familyName[rnd(0,15)]+ surName[rnd(0,14)];
		Student stu = new Student(name, rnd(0,990));
		return stu;
	}
	int rnd(int start, int end) {
		int num = (int)(Math.random()*(end-start+1)+start);
		return num;
	}
}


class Student {
	Student(){}
	Student(String name, int toeic) {
		this.name = name; this.toeic = toeic;
	}
	String name; int toeic;
}



public class Study5 {
	public static void main(String[] args) {
		Student student = new Student("홍길동", 550);
		System.out.println("학생이름: "+student.name +", 토익점수: "+student.toeic );
		
		MakingStu stu = new MakingStu();
		stu.twentyStudents();
		stu.findMax();
		stu.findMaxScoreName();
		
	}

}
