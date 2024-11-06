package sept19;

import java.util.Scanner;

public class Study5 {

	public static void main(String[] args) {
		inputName();
		inputNum();
	}
	// 콘솔을 통해서 데이터 입력받기
	public static void inputName() {
		Scanner s = new Scanner(System.in); //Ctrl + Shift + O
		System.out.print("당신의 이름을 입력하세요: ");
		String name = s.nextLine();
		System.out.println("입력한 이름은 "+ name +"입니다.");
	}
	
	public static void inputNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("원하시는 수를 입력하세요");
		int num = s.nextInt();
		System.out.println(num * 10);
	}
	
}
