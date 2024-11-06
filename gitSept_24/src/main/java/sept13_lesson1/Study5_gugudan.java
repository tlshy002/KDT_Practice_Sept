package sept13_lesson1;

public class Study5_gugudan {

	public static void main(String[] args) {
		gugudan();
	}
	
	public static void gugudan() {
		for(int dan=2; dan<10; dan++) {
			System.out.println("***" + dan + "단***");
			for(int su=1; su < 10; su++) {
				System.out.println(dan+" * "+su+" = "+ su*dan);
			}
			System.out.println();
		}
	}

	
	//2로 나눈 나머지가 0이 아니다 라고 해야 놓치는게 없다. 
}
