package sept06;

public class Study2 {
	public static void test() {
		int data = 123;
		int dataa = 321;
		int dap = data + dataa; //444
		System.out.println(dap);
		method();
	}
	public static void method() {
		float data = 345.6f;
		float dataa = 453.3f;
		float dap = data + dataa; //798.9
		System.out.println(dap);
	}
	
	public static void main(String[] args) {
		test();
		method();
	}
	
}
// 클래스, 메소드를 몇개만들것인가. 
// 마음대로 정하는게 아님. 규칙이있음. 재사용과 확장을 고려해야됨

