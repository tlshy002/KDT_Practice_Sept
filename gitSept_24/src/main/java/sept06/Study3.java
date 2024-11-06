package sept06;

public class Study3 {
	//클래스 안에 선언된 변수 => 인스턴스 변수
	int total = 10;
	//static 이 붙은 변수 => static 변수 ***전역변수와 다름. 자바는 전역변수 없음
	static int sum = 5000; 

	public static void main(String[] args) {
		int data1 = 500; int data2 = 800;
		test(data1, data2);
		test2(173.5, 67, false, 3.14f);	//메서드를 호툴할때 전달하는 데이터 => 인자(argument)
	}
	
	public static void test2(double su1, int su2, boolean su3, float su4) {
			System.out.println("===========test2메서드의결과===========");
			System.out.println(su1 +","+ su2 +","+ su3 +","+ su4);
	}
	
	// 인자를 받는 
	public static void test(int data1, int data2) {
		int result = data1 + data2;
		System.out.println(data1 +"+"+ data2 +"="+ result);
	}

}
