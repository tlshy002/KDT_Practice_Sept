package sept30;

import java.sql.SQLOutput;

class Tiger {
	Tiger(){}
	String name;
	Tiger(String name) {
		this.name = name;
	}
}

public class Study2 {
	
	public static void arrayTest() {
		int data1 = 100;
		int[] data2 = {1,2,3};
		double data3 = 3.34;
		double[] data4 = {1.1, 2.2 ,3.3, 4.4, 5.5};
		
		// 존재하지 않는 인덱스를 적는 경우. 컴파일러가 아직 읽지 않아서 코딩할땐 에러안뜨지만, 실행하면 outOfBound에러
		System.out.println(data2[0]);
		System.out.println(data2[1]);
		System.out.println(data2[2]);
		// System.out.println(data2[3]); //인덱스범위를 벗어나는 에러
		
		String data5 = "대한민국";
		String[] data6 = { "KOREA", "대한민국", "Republic Of Korea" };
		
		Tiger data7 = new Tiger();
		Tiger[] data8 = {new Tiger(), new Tiger(), new Tiger()}; 
		
	}
	
	// 데이터없는 배열을 만들고 나중에 값넣기
	public static void arrayTest2() { //배열도 참조형이다~
		int[] data1 = new int[3];
		data1[0]=1; data1[1]=2; data1[2]=3;
		
		double[] data2 = new double[5];
		data2[0]=1.1; data2[1]=2.2; data2[2]=3.3;
		
		String[] data3 = new String[4];
		data3[0]= "자바"; data3[1]= "웹"; data3[2]= "프레임워크"; data3[3]= "톰캣";
		
		//주의할점. data4에 
		Tiger[] data4 = new Tiger[3]; //배열생성 (아직 Tiger 인스턴스 없음)
		data4[0]=new Tiger(); data4[1]=new Tiger(); data4[2]=new Tiger();
		//배열만 만들어놓고 인스턴스가 있다고 착각하는 경우가 다반사
		//생긴게 인스턴스 생성과 비슷하니 주의하기
	}
	
	// main 의 매개변수 드디어 처음 해석=!
	// 매개변수에 배열선언
	public static void main(String[] args) { 
		
//		arrayTest();
		
		int[] arr = {100,200,300};
		test(arr);
		int arr1 = test1(); //test1에서 리턴한 정수 할당
		int[] arr2 = test2(); //test2에서 리턴한 배열 할당
			
	}
	public static void test(int[] a) { //인자로 배열받음
		System.out.println(a[0]+","+a[1]+","+a[2]);
	}
	public static int test1() {//정수리턴
		return 100;
	}
	public static int[] test2() {//배열리턴
		int[] a = {1,2,3,4,5};
		return a;
	}
}
