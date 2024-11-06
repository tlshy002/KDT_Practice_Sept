package sept24;




public class Study3 {
	public static void main(String[] args) {
		func1(100);
		func2(3.14);
		func3(new Human()); //func3()함수의 인자로 인스턴스(데이터)를 넣음
		
		Human hum = new Human();
		func3(hum); // new 클래스() => 이거 자체가 데이터라고 생각하면 쉬움
		
	}

	public static void func1(int a) {
		System.out.println(a);
	}
	public static void func2(double a) {
		System.out.println(a);
	}
	public static void func3(Human a) { // Human a = new Human(); 
		System.out.println(a.age); 
	}

}




class Human {
	int age = 23;
	
}
