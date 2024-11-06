package sept24;


//웹: 서블릿 --> 스프링 프레임워크
class Calculator { //계산에 대한 책임을 갖는 클래스
	Calculator() {}; //생성자
	

	int add(int a, int b) {
		return a+b; 
	} //덧셈에 책임을 갖는 메서드
	void add(int a, double b) {
		double sum = a+b; System.out.println(sum);
	}
	void add(double a, int b) {
		double sum = a+b; System.out.println(sum);
	}
	void add(double a, double b) {
		double sum = a+b; System.out.println(sum);
	}
	
		
	//뺄셈에 책임을 갖는 메서드
	void minus(int a, int b) {
		int result = a-b;
		System.out.println(result);
	} 
	void minus(int a, double b) {
		double result = a-b;
		System.out.println(result);
	} 	
	void minus(double a, int b) {
		double result = a-b;
		System.out.println(result);
	} 
	void minus(double a, double b) {
		double result = a-b;
		System.out.println(result);
	} 
	
	
	//곱셈에 책임을 갖는 메서드
	void multiply(int a, int b) {
		int result = a*b;
		System.out.println(result);
	} 
	void multiply(int a, double b) {
		double result = a*b;
		System.out.println(result);
	} 	
	void multiply(double a, int b) {
		double result = a*b;
		System.out.println(result);
	} 
	void multiply(double a, double b) {
		double result = a*b;
		System.out.println(result);
	} 
	
	
	
	
	//나눗셈에 책임을 갖는 메서드	//0으로 나누면 무한. 컴에선 에러 //분모에 0안됨
	void div(int a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			int result = a/b;
			System.out.println(result);
		}		
	} 
	void div(int a, double b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			double result = a/b;
			System.out.println(result);
		}	
	}
	void div(double a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			double result = a/b;
			System.out.println(result);
		}	
	}
	void div(double a, double b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			double result = a/b;
			System.out.println(result);
		}	
	}

	
	
	
}




//SRP 단일책임의 원칙
//사칙연산을 책임지는 클래스

//main 함수를 가진 클래스의 책임: 시작
public class Study1_Cal {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10,15);
		cal.add(10, 15.5);
		cal.add(10.5, 15);
		cal.add(10.5, 15.5);
		
		
		//cal.minus(); cal.multiply(); cal.div();
	}
} //class=================================
