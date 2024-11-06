package sept06;

public class Study5 {

	public static void main(String[] args) {
		//plusPlusOp();
		test();
	}
	
	public static void quiz() {
		int a = 5;
		int i = ++a + ++a + a++;
		System.out.println(i);
	}
	public static void test() {
		int a = 0;
		int i = a++;
		System.out.println(i);
		System.out.println(i);
	}

	public static void plusPlusOp() {
		int su1 = 5;
		++su1;
		System.out.println(su1);
		
		int su2 = 8;
		su2++;
		System.out.println(su2);
		//=============================
		int su3 = 3;		int su4 = 2;
		int dap1 = ++su3;	int dap2 = su4++;
		System.out.println(dap1);
		System.out.println(dap2);
	}
	
	
}
