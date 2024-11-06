package sept24;

//강사님 코드랑 비슷하게 한거
//철수,민수,민호,선생님 다 하나하나 객체임

class Minsu2 {
	int age = 12;
	int score = 92;
}
class Chulsu2 {
	int age = 11;
	int score = 90;	
}
class Minho2 {
	int age = 12;
	int score = 91;	
}
class Teacher2 {
	
	//static 메서드와 VS 그냥메서드의 차이 
	static void average(int a, int b, int c) {
		int result = (a+b+c)/3;
		System.out.println(result);
	}
	
	//void 메서드
	void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	void calculate(Minsu a, Chulsu b, Minho c) {
		int sum = a.score + b.score + c.score;
		System.out.println("세 학생의 점수합: "+ sum);
	}
}





public class Study2_2 {
	public static void main(String[] args) {
		Minsu student1 = new Minsu();
		Chulsu student2 = new Chulsu();
		Minho student3 = new Minho();
		
		int score1 = student1.score;
		int score2 = student2.score;
		int score3 = student3.score;		
		Teacher.average(score1, score2, score3);//static 메서드 --> 객체생성없이 바로 사용
		
		Teacher t = new Teacher(); //객체생성                           
		t.sum(score1, score2, score3); //void 메서드
		t.calculate(student1, student2, student3); //void 메서드
		
		
		t.calculate(new Minsu(), student2, student3);
		
	}

}
