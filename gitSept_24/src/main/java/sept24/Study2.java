package sept24;

//가장처음에 나혼자서 짠거.

//민수나이 12세. 미술점수 92
//철수나이 11세. 미술점수 90
//민호나이 12세. 미술점수 91
//세학생의 미술점수 합과 평균 출력

class C {
	
	void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("세 학생의 미술점수 총 합은 "+sum+"입니다.");
	}
	void average(int a, int b, int c) {
		int result = (a+b+c) / 3;
		System.out.println("세 학생의 미술점수 평균은 "+result+"입니다.");
	}
	
}


public class Study2 {
	public static void main(String[] args) {
		C result = new C();
		result.add(92, 90, 91);
		result.average(92, 90, 91);
		//C.add(92,90,91);
	}

}
