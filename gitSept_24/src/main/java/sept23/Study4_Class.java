package sept23;


// Tiger 클래스 안에 있는 변수와 메서드 사용하는 법
// Tiger 클래스 안에 있는 변수나 메서드를 사용하려면, 
// 해당 클래스를 먼저 데이터로 바꿔야한다 클래스-->데이터

class Tiger {
	Tiger(){}; //생성자
	
	
	int age = 2;
	static int sum = 200;
	void showAge(int temp) {
		double myWeight = 103.5;
	}
	void showMyAge() {
		System.out.println("2살");
	}
	int myAge() {
		return age;
	}
	
}//class================================

class Lion{
	Lion(){} //생성자
}


public class Study4_Class {
	public Study4_Class(){} //public 이 붙어있는 클래스의 생성자에도 public 을 붙여줘야됨.
	public static void main(String[] args) {
		test();
		double data = test1();
		
		
		new Lion(); //생성자 호출 -> 생성자는 리턴메서드처럼 데이터를 변수에 담아줘야함
		Lion lion = new Lion(); // ==> Lion 클래스가 인스턴스로 바뀜
		
		Tiger tiger = new Tiger();
		int tigerAge = tiger.age;
		
		int tigerSum = tiger.sum; //이렇게 쓰면 안됨. 문법적 오류는 없지만 이렇게 쓰라고 만든게 아님
		int tigerSum2 = Tiger.sum; //static 변수이므로 인스턴스로 바꾸지않고 이렇게 사용해야함!
		//C언어에서 전역이라는 의미의 static 과 전혀 다름
		
		
		System.out.println(tigerAge + tigerSum ); //클래스의 데이터를 
		tiger.myAge();
		
	}
	public static void test() {}
	public static double test1() {
		return 3.141592;
	}

}
